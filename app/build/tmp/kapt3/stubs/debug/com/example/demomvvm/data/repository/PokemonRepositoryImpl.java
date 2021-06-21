package com.example.demomvvm.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/demomvvm/data/repository/PokemonRepositoryImpl;", "Lcom/example/demomvvm/data/repository/PokemonRepository;", "remote", "Lcom/example/demomvvm/data/source/PokemonDataSource$Remote;", "local", "Lcom/example/demomvvm/data/source/PokemonDataSource$Local;", "(Lcom/example/demomvvm/data/source/PokemonDataSource$Remote;Lcom/example/demomvvm/data/source/PokemonDataSource$Local;)V", "addFavorites", "", "pokemon", "Lcom/example/demomvvm/data/model/Pokemon;", "(Lcom/example/demomvvm/data/model/Pokemon;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFavoritesPokemons", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPokemons", "Lcom/example/demomvvm/data/model/PokemonResponse;", "offset", "", "limit", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavoritePokemon", "", "removeFavoritePokemon", "app_debug"})
public final class PokemonRepositoryImpl implements com.example.demomvvm.data.repository.PokemonRepository {
    private final com.example.demomvvm.data.source.PokemonDataSource.Remote remote = null;
    private final com.example.demomvvm.data.source.PokemonDataSource.Local local = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getPokemons(@org.jetbrains.annotations.Nullable()
    java.lang.String offset, @org.jetbrains.annotations.Nullable()
    java.lang.String limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.demomvvm.data.model.PokemonResponse> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addFavorites(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.model.Pokemon pokemon, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object isFavoritePokemon(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.model.Pokemon pokemon, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllFavoritesPokemons(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.demomvvm.data.model.Pokemon>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object removeFavoritePokemon(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.model.Pokemon pokemon, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public PokemonRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.source.PokemonDataSource.Remote remote, @org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.source.PokemonDataSource.Local local) {
        super();
    }
}