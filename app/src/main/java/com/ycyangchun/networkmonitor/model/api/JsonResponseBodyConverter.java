package com.ycyangchun.networkmonitor.model.api;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.ycyangchun.networkmonitor.utils.Base64Util;
import com.ycyangchun.networkmonitor.utils.Des3Util;

import java.io.IOException;
import java.io.StringReader;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Created by YangChun .
 * on 2017/3/11.
 * 自定义响应ResponseBody
 */

public class JsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final Gson mGson;//gson对象
    private final TypeAdapter<T> adapter;

    /**
     * 构造器
     */
    public JsonResponseBodyConverter(Gson gson, TypeAdapter<T> adapter) {
        this.mGson = gson;
        this.adapter = adapter;
    }

    /**
     * 转换
     *
     * @param responseBody
     * @return
     * @throws IOException
     */
    @Override
    public T convert(ResponseBody responseBody) throws IOException {
        String response = responseBody.string();
        String result ;//解密
        try {
            result = Des3Util.getInstance(ApiService.SECRET_KEY, ApiService.SECRET_VALUE).decode(Base64Util.decode(response));
        } catch (Exception e) {
           throw new IOException("Decryption failure");
        }
        Log.i("", "解密的服务器数据：" + result);
        JsonReader jsonReader = mGson.newJsonReader(new StringReader(result));
        try {
            return adapter.read(jsonReader);
        } finally {
            responseBody.close();
        }
    }
}
