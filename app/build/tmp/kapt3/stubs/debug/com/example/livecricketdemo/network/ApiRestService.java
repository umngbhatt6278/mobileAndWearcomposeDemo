package com.example.livecricketdemo.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/livecricketdemo/network/ApiRestService;", "", "getCricketDetails", "Lretrofit2/Response;", "Lcom/example/livecricketdemo/model/response/get_innings/GetScroreCardResponse;", "eid", "", "Timezone", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLiveMatches", "Lcom/example/livecricketdemo/model/response/LiveCricketListResponse;", "category", "listbydate", "date", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface ApiRestService {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.livecricketdemo.network.ApiRestService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "list-live")
    public abstract java.lang.Object getLiveMatches(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "Category")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "Timezone")
    java.lang.String Timezone, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.livecricketdemo.model.response.LiveCricketListResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "list-by-date")
    public abstract java.lang.Object listbydate(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "Category")
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "Timezone")
    java.lang.String Timezone, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "Date")
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.livecricketdemo.model.response.LiveCricketListResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "get-innings")
    public abstract java.lang.Object getCricketDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "Eid")
    java.lang.String eid, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "Category")
    java.lang.String Timezone, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.livecricketdemo.model.response.get_innings.GetScroreCardResponse>> continuation);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086\u0002\u00a8\u0006\u000b"}, d2 = {"Lcom/example/livecricketdemo/network/ApiRestService$Companion;", "", "()V", "invoke", "Lcom/example/livecricketdemo/network/ApiRestService;", "context", "Landroid/content/Context;", "networkInterceptor", "Lcom/example/livecricketdemo/network/interceptor/NetworkInterceptor;", "headerInterceptor", "Lcom/example/livecricketdemo/network/interceptor/HeaderInterceptor;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.livecricketdemo.network.ApiRestService invoke(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.example.livecricketdemo.network.interceptor.NetworkInterceptor networkInterceptor, @org.jetbrains.annotations.NotNull()
        com.example.livecricketdemo.network.interceptor.HeaderInterceptor headerInterceptor) {
            return null;
        }
    }
}