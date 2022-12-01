package com.example.livecricketdemo.repository;

import java.lang.System;

@dagger.hilt.android.scopes.ActivityRetainedScoped()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ+\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/livecricketdemo/repository/DemoRepository;", "Lcom/example/livecricketdemo/network/SafeApiRequest;", "context", "Landroid/content/Context;", "api", "Lcom/example/livecricketdemo/network/ApiRestService;", "(Landroid/content/Context;Lcom/example/livecricketdemo/network/ApiRestService;)V", "getCricketDetails", "Lcom/example/livecricketdemo/model/response/get_innings/GetScroreCardResponse;", "eid", "", "category", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "Lcom/example/livecricketdemo/model/response/LiveCricketListResponse;", "Timezone", "listbydate", "date", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DemoRepository extends com.example.livecricketdemo.network.SafeApiRequest {
    private final com.example.livecricketdemo.network.ApiRestService api = null;
    
    @javax.inject.Inject()
    public DemoRepository(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.example.livecricketdemo.network.ApiRestService api) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProducts(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    java.lang.String Timezone, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.livecricketdemo.model.response.LiveCricketListResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object listbydate(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    java.lang.String Timezone, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.livecricketdemo.model.response.LiveCricketListResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCricketDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String eid, @org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.livecricketdemo.model.response.get_innings.GetScroreCardResponse> continuation) {
        return null;
    }
}