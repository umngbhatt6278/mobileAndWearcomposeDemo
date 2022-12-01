package com.example.livecricketdemo.ui.category;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.example.livecricketdemo.core.uI.BaseActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.Override;

/**
 * A generated base class to be extended by the @dagger.hilt.android.AndroidEntryPoint annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
public abstract class Hilt_LiveMatchCategoriesScreen extends BaseActivity {
  private boolean injected = false;

  Hilt_LiveMatchCategoriesScreen() {
    super();
    _initHiltInternal();
  }

  private void _initHiltInternal() {
    addOnContextAvailableListener(new OnContextAvailableListener() {
      @Override
      public void onContextAvailable(Context context) {
        inject();
      }
    });
  }

  protected void inject() {
    if (!injected) {
      injected = true;
      ((LiveMatchCategoriesScreen_GeneratedInjector) UnsafeCasts.<GeneratedComponentManagerHolder>unsafeCast(this).generatedComponent()).injectLiveMatchCategoriesScreen(UnsafeCasts.<LiveMatchCategoriesScreen>unsafeCast(this));
    }
  }
}
