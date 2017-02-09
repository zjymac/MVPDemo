package com.example.a58.mvpdemo.Activity.model;

/**
 * 描述：
 * 作者：58 on 2017/2/8 11:32
 */
public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void login(String name, String pwd, LoginInteractorListenter loginInteractorListenter) {
        if ("zjy".equals(name) && "123".equals(pwd)) {
            loginInteractorListenter.onSuccess();
        } else {
            loginInteractorListenter.onFailed("msg");
        }
        loginInteractorListenter.onRequestFinish();
    }

    @Override
    public void cancelRequest(String requestTag) {
        //取消指定请求
    }

    @Override
    public void cancelAllRequest() {
        //取消所有请求
    }
}
