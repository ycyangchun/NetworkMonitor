package com.ycyangchun.networkmonitor.model.entity;

/**
 * Created by YangChun .
 * on 2017/3/15.
 */

public class LoginBody {

    /**
     * storeUid : 10000
     * password : 123456
     */

    private String storeUid;
    private String password;

    public LoginBody() {
    }

    public LoginBody(String storeUid, String password) {
        this.storeUid = storeUid;
        this.password = password;
    }

    public String getStoreUid() {
        return storeUid;
    }

    public void setStoreUid(String storeUid) {
        this.storeUid = storeUid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
