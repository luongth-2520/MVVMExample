package com.example.demomvvm.data.source.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/example/demomvvm/data/source/local/PokemonLocalImpl;", "Lcom/example/demomvvm/data/source/PokemonDataSource$Local;", "pokemonDAO", "Lcom/example/demomvvm/data/source/local/PokemonDAO;", "(Lcom/example/demomvvm/data/source/local/PokemonDAO;)V", "addFavoritePokemon", "", "pokemon", "Lcom/example/demomvvm/data/model/Pokemon;", "(Lcom/example/demomvvm/data/model/Pokemon;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPokemons", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFavoritePokemon", "", "removeFavoritePokemon", "app_debug"})
public final class PokemonLocalImpl implements com.example.demomvvm.data.source.PokemonDataSource.Local {
    private final com.example.demomvvm.data.source.local.PokemonDAO pokemonDAO = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object addFavoritePokemon(@org.jetbrains.annotations.NotNull()
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
    public java.lang.Object getAllPokemons(@org.jetbrains.annotations.NotNull()
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
    
    public PokemonLocalImpl(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.source.local.PokemonDAO pokemonDAO) {
        super();
    }
}