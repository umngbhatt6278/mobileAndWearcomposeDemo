package com.example.livecricketdemo.di;

import java.lang.System;

/**
 * Created by Jeetesh Surana.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0012\u0010\u0011\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/livecricketdemo/di/NetworkModule;", "", "()V", "getApiRestService", "Lcom/example/livecricketdemo/network/ApiRestService;", "appContext", "Landroid/content/Context;", "networkInterceptor", "Lcom/example/livecricketdemo/network/interceptor/NetworkInterceptor;", "headerInterceptor", "Lcom/example/livecricketdemo/network/interceptor/HeaderInterceptor;", "getDeviceUtil", "Lcom/ComposeDemoApp/util/DeviceUtil;", "preferenceProvider", "Lcom/ComposeDemoApp/util/PreferenceProvider;", "getHeaderInterceptor", "deviceUtil", "getNetworkInterceptor", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.ComposeDemoApp.util.DeviceUtil getDeviceUtil(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    com.ComposeDemoApp.util.PreferenceProvider preferenceProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.livecricketdemo.network.interceptor.NetworkInterceptor getNetworkInterceptor(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.livecricketdemo.network.interceptor.HeaderInterceptor getHeaderInterceptor(@org.jetbrains.annotations.NotNull()
    com.ComposeDemoApp.util.DeviceUtil deviceUtil, @org.jetbrains.annotations.NotNull()
    com.ComposeDemoApp.util.PreferenceProvider preferenceProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.livecricketdemo.network.ApiRestService getApiRestService(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    com.example.livecricketdemo.network.interceptor.NetworkInterceptor networkInterceptor, @org.jetbrains.annotations.NotNull()
    com.example.livecricketdemo.network.interceptor.HeaderInterceptor headerInterceptor) {
        return null;
    }
}