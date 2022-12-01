// Generated by Dagger (https://dagger.dev).
package com.example.livecricketdemo.repository;

import android.content.Context;
import com.example.livecricketdemo.network.ApiRestService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DemoRepository_Factory implements Factory<DemoRepository> {
  private final Provider<Context> contextProvider;

  private final Provider<ApiRestService> apiProvider;

  public DemoRepository_Factory(Provider<Context> contextProvider,
      Provider<ApiRestService> apiProvider) {
    this.contextProvider = contextProvider;
    this.apiProvider = apiProvider;
  }

  @Override
  public DemoRepository get() {
    return newInstance(contextProvider.get(), apiProvider.get());
  }

  public static DemoRepository_Factory create(Provider<Context> contextProvider,
      Provider<ApiRestService> apiProvider) {
    return new DemoRepository_Factory(contextProvider, apiProvider);
  }

  public static DemoRepository newInstance(Context context, ApiRestService api) {
    return new DemoRepository(context, api);
  }
}
