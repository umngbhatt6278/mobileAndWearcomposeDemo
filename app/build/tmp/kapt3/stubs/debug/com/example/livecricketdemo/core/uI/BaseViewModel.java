package com.example.livecricketdemo.core.uI;

import java.lang.System;

/**
 * Created by Umang Bhatt.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/livecricketdemo/core/uI/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "mError", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/livecricketdemo/model/data/ErrorModel;", "getMError", "()Landroidx/lifecycle/MutableLiveData;", "setMError", "(Landroidx/lifecycle/MutableLiveData;)V", "app_debug"})
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.livecricketdemo.model.data.ErrorModel> mError;
    
    public BaseViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.livecricketdemo.model.data.ErrorModel> getMError() {
        return null;
    }
    
    public final void setMError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.livecricketdemo.model.data.ErrorModel> p0) {
    }
}