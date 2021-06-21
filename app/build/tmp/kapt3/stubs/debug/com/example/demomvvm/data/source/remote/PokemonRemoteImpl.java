package com.example.demomvvm.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/example/demomvvm/data/source/remote/PokemonRemoteImpl;", "Lcom/example/demomvvm/data/source/PokemonDataSource$Remote;", "apiService", "Lcom/example/demomvvm/data/source/remote/ApiService;", "(Lcom/example/demomvvm/data/source/remote/ApiService;)V", "getPokemons", "Lcom/example/demomvvm/data/model/PokemonResponse;", "offset", "", "limit", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PokemonRemoteImpl implements com.example.demomvvm.data.source.PokemonDataSource.Remote {
    private final com.example.demomvvm.data.source.remote.ApiService apiService = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPokemons(@org.jetbrains.annotations.Nullable()
    java.lang.String offset, @org.jetbrains.annotations.Nullable()
    java.lang.String limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.demomvvm.data.model.PokemonResponse> p2) {
        return null;
    }
    
    public PokemonRemoteImpl(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.source.remote.ApiService apiService) {
        super();
    }
}