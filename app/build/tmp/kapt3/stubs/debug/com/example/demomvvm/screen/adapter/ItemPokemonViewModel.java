package com.example.demomvvm.screen.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fR\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/demomvvm/screen/adapter/ItemPokemonViewModel;", "Landroidx/databinding/BaseObservable;", "itemClickListener", "Lcom/example/demomvvm/utils/OnItemClickListener;", "Lcom/example/demomvvm/data/model/Pokemon;", "(Lcom/example/demomvvm/utils/OnItemClickListener;)V", "pokemon", "getPokemon", "()Lcom/example/demomvvm/data/model/Pokemon;", "setPokemon", "(Lcom/example/demomvvm/data/model/Pokemon;)V", "position", "", "onItemClicked", "", "view", "Landroid/view/View;", "setData", "data", "binding", "Lcom/example/demomvvm/databinding/ItemPokemonBinding;", "pos", "app_debug"})
public final class ItemPokemonViewModel extends androidx.databinding.BaseObservable {
    @org.jetbrains.annotations.Nullable()
    @androidx.databinding.Bindable()
    private com.example.demomvvm.data.model.Pokemon pokemon;
    private int position = 0;
    private final com.example.demomvvm.utils.OnItemClickListener<com.example.demomvvm.data.model.Pokemon> itemClickListener = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.demomvvm.data.model.Pokemon getPokemon() {
        return null;
    }
    
    public final void setPokemon(@org.jetbrains.annotations.Nullable()
    com.example.demomvvm.data.model.Pokemon p0) {
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.example.demomvvm.data.model.Pokemon data, @org.jetbrains.annotations.NotNull()
    com.example.demomvvm.databinding.ItemPokemonBinding binding, int pos) {
    }
    
    public final void onItemClicked(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public ItemPokemonViewModel(@org.jetbrains.annotations.Nullable()
    com.example.demomvvm.utils.OnItemClickListener<com.example.demomvvm.data.model.Pokemon> itemClickListener) {
        super();
    }
    
    public ItemPokemonViewModel() {
        super();
    }
}