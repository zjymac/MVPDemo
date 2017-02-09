package com.example.a58.mvpdemo.mvp;

public interface MvpPresenter<T extends MvpView> {

    /**
     * 将MVP的View附加到Presenter
     */
    void attachView(T view);
    
    /**
     *解绑
     */
    void detachView();
}
