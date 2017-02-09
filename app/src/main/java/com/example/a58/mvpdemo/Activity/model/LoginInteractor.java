package com.example.a58.mvpdemo.Activity.model;

import com.example.a58.mvpdemo.mvp.MvpInteractor;

/**
 * 描述：
 * 作者：58 on 2017/2/7 18:32
 */
public interface LoginInteractor extends MvpInteractor {
    void login(String name, String pwd, LoginInteractorListenter loginInteractorListenter);

    interface LoginInteractorListenter {
        void onSuccess();

        void onFailed(String msg);

        void onRequestFinish();
    }
}
