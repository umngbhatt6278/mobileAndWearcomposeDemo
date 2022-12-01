package com.example.livecricketdemo.ui.crickeet;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0003\u001a\b\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0012\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0005H\u0007\u001a\u001e\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\u0011\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0005H\u0007\u001a \u0010\u0012\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0007\u001a \u0010\u0016\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0007\u001a\"\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\u0018\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007\u00a8\u0006 "}, d2 = {"CategoryDetailsCollapsingToolbar", "", "viewModel", "Lcom/example/livecricketdemo/ui/category/FoodCategoriesViewModel;", "productId", "", "index", "DefaultPreview", "DescriptionText", "heading", "EventCards", "event", "Lcom/example/livecricketdemo/model/response/get_innings/bat;", "playerList", "", "Lcom/example/livecricketdemo/model/response/get_innings/prns;", "HeadingImage", "HeadingText", "Quadrant", "description", "modifier", "Landroidx/compose/ui/Modifier;", "QuadrantImage", "ScoreCard", "data", "Lcom/example/livecricketdemo/model/response/Stage;", "scoreCardList", "ScoreCardFootBall", "teamOneBatting", "Lcom/example/livecricketdemo/model/response/get_innings/GetScroreCardResponse;", "i", "", "app_debug"})
public final class ScoreCricketKt {
    
    @androidx.compose.runtime.Composable()
    @android.annotation.SuppressLint(value = {"UnusedMaterialScaffoldPaddingParameter", "CoroutineCreationDuringComposition"})
    @androidx.compose.material.ExperimentalMaterialApi()
    private static final void CategoryDetailsCollapsingToolbar(com.example.livecricketdemo.ui.category.FoodCategoriesViewModel viewModel, java.lang.String productId, java.lang.String index) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    public static final void ScoreCardFootBall(@org.jetbrains.annotations.NotNull()
    com.example.livecricketdemo.model.response.Stage data) {
    }
    
    @androidx.compose.runtime.Composable()
    @kotlin.OptIn(markerClass = {androidx.compose.material.ExperimentalMaterialApi.class})
    @androidx.compose.material.ExperimentalMaterialApi()
    public static final void ScoreCard(@org.jetbrains.annotations.NotNull()
    com.example.livecricketdemo.model.response.Stage data, @org.jetbrains.annotations.Nullable()
    com.example.livecricketdemo.ui.category.FoodCategoriesViewModel scoreCardList, @org.jetbrains.annotations.NotNull()
    java.lang.String productId) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void teamOneBatting(@org.jetbrains.annotations.NotNull()
    com.example.livecricketdemo.model.response.get_innings.GetScroreCardResponse data, int i) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void EventCards(@org.jetbrains.annotations.NotNull()
    com.example.livecricketdemo.model.response.get_innings.bat event, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.livecricketdemo.model.response.get_innings.prns> playerList) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void Quadrant(@org.jetbrains.annotations.NotNull()
    java.lang.String heading, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void QuadrantImage(@org.jetbrains.annotations.NotNull()
    java.lang.String heading, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void HeadingText(@org.jetbrains.annotations.NotNull()
    java.lang.String heading) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void HeadingImage(@org.jetbrains.annotations.NotNull()
    java.lang.String heading) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DescriptionText(@org.jetbrains.annotations.NotNull()
    java.lang.String heading) {
    }
    
    @androidx.compose.runtime.Composable()
    @androidx.compose.ui.tooling.preview.Preview(showBackground = true)
    public static final void DefaultPreview() {
    }
}