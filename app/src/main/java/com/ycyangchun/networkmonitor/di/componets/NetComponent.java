package com.ycyangchun.networkmonitor.di.componets;



import com.ycyangchun.networkmonitor.di.modules.NetModule;
import com.ycyangchun.networkmonitor.model.api.ApiService;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 *
 */
@Component(modules = NetModule.class)
@Singleton
public interface NetComponent {
    ApiService getApiService();

    OkHttpClient getOkHttp();

    Retrofit getRetrofit();
}
