package com.example.demomvvm.screen.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u0012\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001cR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001d"}, d2 = {"Lcom/example/demomvvm/screen/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/demomvvm/data/repository/PokemonRepository;", "(Lcom/example/demomvvm/data/repository/PokemonRepository;)V", "_pokemon", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/demomvvm/data/model/Pokemon;", "_pokemons", "Lcom/example/demomvvm/utils/Resource;", "Lcom/example/demomvvm/data/model/PokemonResponse;", "isLoadingMore", "", "pokemon", "Landroidx/lifecycle/LiveData;", "getPokemon", "()Landroidx/lifecycle/LiveData;", "pokemons", "getPokemons", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getScrollListener", "()Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "addToFavorite", "Lkotlinx/coroutines/Job;", "pos", "", "loadMoreData", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.demomvvm.utils.Resource<com.example.demomvvm.data.model.PokemonResponse>> _pokemons = null;
    private final androidx.lifecycle.MutableLiveData<com.example.demomvvm.data.model.Pokemon> _pokemon = null;
    private boolean isLoadingMore = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener scrollListener = null;
    private final com.example.demomvvm.data.repository.PokemonRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.demomvvm.utils.Resource<com.example.demomvvm.data.model.PokemonResponse>> getPokemons() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.demomvvm.data.model.Pokemon> getPokemon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView.OnScrollListener getScrollListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addToFavorite(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.model.Pokemon pokemon, int pos) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getPokemons() {
        return null;
    }
    
    public final void loadMoreData() {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.repository.PokemonRepository repository) {
        super();
    }
}