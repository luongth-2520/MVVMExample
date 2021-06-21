package com.example.demomvvm.data.source.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/demomvvm/data/source/local/PokemonDAO;", "", "delete", "", "pokemon", "Lcom/example/demomvvm/data/model/Pokemon;", "(Lcom/example/demomvvm/data/model/Pokemon;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPokemons", "", "insert", "isFavoritesPokemon", "", "pokemonName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface PokemonDAO {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.model.Pokemon pokemon, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.model.Pokemon pokemon, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Favorites_Pokemon")
    public abstract java.util.List<com.example.demomvvm.data.model.Pokemon> getAllPokemons();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT EXISTS(SELECT * FROM Favorites_Pokemon WHERE name = :pokemonName)")
    public abstract java.lang.Object isFavoritesPokemon(@org.jetbrains.annotations.NotNull()
    java.lang.String pokemonName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1);
}