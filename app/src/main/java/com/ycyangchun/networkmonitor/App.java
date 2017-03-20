package com.ycyangchun.networkmonitor;

import android.app.Application;

import com.ycyangchun.networkmonitor.di.componets.DaggerNetComponent;
import com.ycyangchun.networkmonitor.di.componets.NetComponent;
import com.ycyangchun.networkmonitor.di.modules.NetModule;

/**
 * Created by YangChun .
 * on 2017/3/20.
 */

public class App extends Application {

    private NetComponent netComponent;
    @Override
    public void onCreate() {
        super.onCreate();

    }
    //net
    private void initNet() {
        netComponent = DaggerNetComponent.builder()
                .netModule(new NetModule(this))
                .build();
    }
}
