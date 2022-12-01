package com.example.livecricketdemo.network;

import java.lang.System;

/**
 * Created by Umang Bhatt.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/livecricketdemo/network/ApiException;", "Ljava/io/IOException;", "message", "", "errno", "code", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getCode", "()I", "setCode", "(I)V", "getErrno", "()Ljava/lang/String;", "setErrno", "(Ljava/lang/String;)V", "app_debug"})
public final class ApiException extends java.io.IOException {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String errno;
    private int code;
    
    public ApiException(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String errno, int code) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getErrno() {
        return null;
    }
    
    public final void setErrno(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getCode() {
        return 0;
    }
    
    public final void setCode(int p0) {
    }
}