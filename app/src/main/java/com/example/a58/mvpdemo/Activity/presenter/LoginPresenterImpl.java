package com.example.a58.mvpdemo.Activity.presenter;

import com.example.a58.mvpdemo.Activity.model.LoginInteractor;
import com.example.a58.mvpdemo.Activity.model.LoginInteractorImpl;
import com.example.a58.mvpdemo.Activity.view.LoginView;

/**
 * 描述：
 * 作者：58 on 2017/2/8 11:31
 */
public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.LoginInteractorListenter {
    private LoginView loginView;
    private LoginInteractor loginInteractor;

    @Override
    public void attachView(LoginView view) {
        loginInteractor = new LoginInteractorImpl();
        loginView = view;
    }

    @Override
    public void detachView() {
        loginInteractor.cancelAllRequest();
        loginView = null;
        loginInteractor = null;
    }

    @Override
    public void userLogin(String name, String pwd) {
        loginView.showLoading();
        loginInteractor.login(name, pwd, this);
    }

    @Override
    public void onSuccess() {
        loginView.loginSucceed();
    }

    @Override
    public void onFailed(String msg) {
        loginView.loginFailed(msg);
    }

    @Override
    public void onRequestFinish() {
        loginView.hideLoading();
    }
}
