package com.ycyangchun.networkmonitor.model.api;


import com.ycyangchun.networkmonitor.model.entity.CommonEntity;
import com.ycyangchun.networkmonitor.model.entity.LoginBody;
import com.ycyangchun.networkmonitor.model.entity.LoginEntity;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 *
 */
public interface ApiService {
    String SECRET_KEY = "key";
    String SECRET_VALUE = "value";

    /**
     * 登录(POST)
     * @param data
     * @return
     */
    @POST("/storeLogin")
    Observable<CommonEntity<LoginEntity>> storeLogin(@Body LoginBody data);

}
