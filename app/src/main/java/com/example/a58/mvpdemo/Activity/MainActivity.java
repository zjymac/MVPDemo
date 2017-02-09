package com.example.a58.mvpdemo.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a58.mvpdemo.Activity.presenter.LoginPresenter;
import com.example.a58.mvpdemo.Activity.presenter.LoginPresenterImpl;
import com.example.a58.mvpdemo.Activity.view.LoginView;
import com.example.a58.mvpdemo.R;

public class MainActivity extends Activity implements LoginView {
    private EditText t1, t2;
    private Button btn;
    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText) findViewById(R.id.t1);
        t2 = (EditText) findViewById(R.id.t2);
        btn = (Button) findViewById(R.id.btn1);
        loginPresenter = new LoginPresenterImpl();
        loginPresenter.attachView(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginPresenter.detachView();
    }

    @Override
    public void showLoading() {
        //显示加载框
    }

    @Override
    public void loginSucceed() {
        //提示登录成功
    }

    @Override
    public void loginFailed(String msg) {
        //提示登录失败
    }

    @Override
    public void hideLoading() {
        //隐藏加载框
    }
}
