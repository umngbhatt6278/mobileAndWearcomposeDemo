// Generated by Dagger (https://dagger.dev).
package com.example.livecricketdemo.di;

import android.content.Context;
import com.ComposeDemoApp.util.PreferenceProvider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_GetPreferenceManagerFactory implements Factory<PreferenceProvider> {
  private final AppModule module;

  private final Provider<Context> appContextProvider;

  public AppModule_GetPreferenceManagerFactory(AppModule module,
      Provider<Context> appContextProvider) {
    this.module = module;
    this.appContextProvider = appContextProvider;
  }

  @Override
  public PreferenceProvider get() {
    return getPreferenceManager(module, appContextProvider.get());
  }

  public static AppModule_GetPreferenceManagerFactory create(AppModule module,
      Provider<Context> appContextProvider) {
    return new AppModule_GetPreferenceManagerFactory(module, appContextProvider);
  }

  public static PreferenceProvider getPreferenceManager(AppModule instance, Context appContext) {
    return Preconditions.checkNotNullFromProvides(instance.getPreferenceManager(appContext));
  }
}
