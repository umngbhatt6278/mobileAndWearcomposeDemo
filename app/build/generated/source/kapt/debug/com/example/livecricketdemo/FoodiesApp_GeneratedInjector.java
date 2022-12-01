package com.example.livecricketdemo;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = FoodiesApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface FoodiesApp_GeneratedInjector {
  void injectFoodiesApp(FoodiesApp foodiesApp);
}
