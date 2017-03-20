package com.ycyangchun.networkmonitor.presenter;


import com.ycyangchun.networkmonitor.model.entity.LoginBody;
import com.ycyangchun.networkmonitor.model.entity.LoginEntity;

/**
 * Created by YangChun .
 * on 2017/3/14.
 * 登录
 */

public interface LoginContract {
    interface Presenter{
        void login(LoginBody body);
    }
    interface  View{
        void showOnFailure(Throwable throwable);
        void successLogin(LoginEntity loginEntity, String pwd);
    }
}
