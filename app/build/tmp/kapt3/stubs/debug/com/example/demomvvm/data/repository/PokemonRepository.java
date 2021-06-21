package com.example.demomvvm.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ%\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/demomvvm/data/repository/PokemonRepository;", "", "addFavorites", "", "pokemon", "Lcom/example/demomvvm/data/model/Pokemon;", "(Lcom/example/demomvvm/data/model/Pokemon;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFavoritesPokemons", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPokemons", "Lcom/example/demomvvm/data/model/PokemonResponse;", "offset", "", "limit", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavoritePokemon", "", "removeFavoritePokemon", "app_debug"})
public abstract interface PokemonRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPokemons(@org.jetbrains.annotations.Nullable()
    java.lang.String offset, @org.jetbrains.annotations.Nullable()
    java.lang.String limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.demomvvm.data.model.PokemonResponse> p2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addFavorites(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.model.Pokemon pokemon, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isFavoritePokemon(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.model.Pokemon pokemon, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllFavoritesPokemons(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.demomvvm.data.model.Pokemon>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeFavoritePokemon(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.model.Pokemon pokemon, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}