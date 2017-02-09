package com.example.a58.mvpdemo.Activity.presenter;

import com.example.a58.mvpdemo.Activity.view.LoginView;
import com.example.a58.mvpdemo.mvp.MvpPresenter;

/**
 * 描述：
 * 作者：58 on 2017/2/8 11:27
 */
public interface LoginPresenter extends MvpPresenter<LoginView>{
    void  userLogin(String name,String pwd);
}
