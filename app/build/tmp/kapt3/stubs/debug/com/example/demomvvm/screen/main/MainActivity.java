package com.example.demomvvm.screen.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0018\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0014J\b\u0010\u001c\u001a\u00020\u0013H\u0014J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/example/demomvvm/screen/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/demomvvm/utils/OnItemClickListener;", "Lcom/example/demomvvm/data/model/Pokemon;", "()V", "binding", "Lcom/example/demomvvm/databinding/ActivityMainBinding;", "mainViewModel", "Lcom/example/demomvvm/screen/main/MainViewModel;", "getMainViewModel", "()Lcom/example/demomvvm/screen/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "pokemonAdapter", "Lcom/example/demomvvm/screen/adapter/PokemonAdapter;", "getPokemonAdapter", "()Lcom/example/demomvvm/screen/adapter/PokemonAdapter;", "pokemonAdapter$delegate", "bindView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemViewClick", "item", "position", "", "onStart", "onStop", "registerLiveData", "setUpView", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.demomvvm.utils.OnItemClickListener<com.example.demomvvm.data.model.Pokemon> {
    private final kotlin.Lazy pokemonAdapter$delegate = null;
    private com.example.demomvvm.databinding.ActivityMainBinding binding;
    private final kotlin.Lazy mainViewModel$delegate = null;
    
    private final com.example.demomvvm.screen.adapter.PokemonAdapter getPokemonAdapter() {
        return null;
    }
    
    private final com.example.demomvvm.screen.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bindView() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void setUpView() {
    }
    
    private final void registerLiveData() {
    }
    
    @java.lang.Override()
    public void onItemViewClick(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.model.Pokemon item, int position) {
    }
    
    public MainActivity() {
        super();
    }
}