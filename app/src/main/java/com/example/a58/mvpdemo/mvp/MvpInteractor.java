package com.example.a58.mvpdemo.mvp;

/**
 * <p>Title: MvpInteractor</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author zjy
 * @date 2016-4-12上午11:26:23
 */
public interface MvpInteractor {

    /**
     * 取消通过requestTag指定的请求
     *
     * @param requestTag 请求所拥有的标识
     */
    void cancelRequest(String requestTag);

    /**
     * 取消所有的请求
     */
    void cancelAllRequest();

//    interface DefaultRequestListener<T, F> {
//
//        void requestSuccess(T t);
//
//        void requestFailure(F f);
//
//        void requestFinish();
//    }
}
