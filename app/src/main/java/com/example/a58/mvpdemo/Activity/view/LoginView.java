package com.example.a58.mvpdemo.Activity.view;

import com.example.a58.mvpdemo.mvp.MvpView;

/**
 * 描述：
 * 作者：58 on 2017/2/8 11:28
 */
public interface LoginView extends MvpView {
    void showLoading();

    void loginSucceed();

    void loginFailed(String msg);

    void hideLoading();
}
