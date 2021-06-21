package com.example.demomvvm.screen.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0014\u0010\u0014\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0016\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\nJ\u0016\u0010\u0019\u001a\u00020\n2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/demomvvm/screen/adapter/PokemonAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/demomvvm/screen/adapter/PokemonAdapter$ItemViewHolder;", "()V", "itemClickListener", "Lcom/example/demomvvm/utils/OnItemClickListener;", "Lcom/example/demomvvm/data/model/Pokemon;", "pokemons", "", "clear", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "registerItemClickListener", "onItemClickListener", "setFavorites", "pokemon", "unRegisterItemClickListener", "updateData", "newData", "ItemViewHolder", "app_debug"})
public final class PokemonAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.demomvvm.screen.adapter.PokemonAdapter.ItemViewHolder> {
    private final java.util.List<com.example.demomvvm.data.model.Pokemon> pokemons = null;
    private com.example.demomvvm.utils.OnItemClickListener<com.example.demomvvm.data.model.Pokemon> itemClickListener;
    
    public final void updateData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.demomvvm.data.model.Pokemon> newData) {
    }
    
    public final void clear() {
    }
    
    public final void setFavorites(int position, @org.jetbrains.annotations.NotNull()
    com.example.demomvvm.data.model.Pokemon pokemon) {
    }
    
    public final void registerItemClickListener(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.utils.OnItemClickListener<com.example.demomvvm.data.model.Pokemon> onItemClickListener) {
    }
    
    public final void unRegisterItemClickListener() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.demomvvm.screen.adapter.PokemonAdapter.ItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.demomvvm.screen.adapter.PokemonAdapter.ItemViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public PokemonAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/demomvvm/screen/adapter/PokemonAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/demomvvm/databinding/ItemPokemonBinding;", "itemClickListener", "Lcom/example/demomvvm/utils/OnItemClickListener;", "Lcom/example/demomvvm/data/model/Pokemon;", "itemViewModel", "Lcom/example/demomvvm/screen/adapter/ItemPokemonViewModel;", "(Lcom/example/demomvvm/databinding/ItemPokemonBinding;Lcom/example/demomvvm/utils/OnItemClickListener;Lcom/example/demomvvm/screen/adapter/ItemPokemonViewModel;)V", "bind", "", "pokemon", "app_debug"})
    public static final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.demomvvm.databinding.ItemPokemonBinding binding = null;
        private final com.example.demomvvm.utils.OnItemClickListener<com.example.demomvvm.data.model.Pokemon> itemClickListener = null;
        private final com.example.demomvvm.screen.adapter.ItemPokemonViewModel itemViewModel = null;
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        com.example.demomvvm.data.model.Pokemon pokemon) {
        }
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.demomvvm.databinding.ItemPokemonBinding binding, @org.jetbrains.annotations.Nullable()
        com.example.demomvvm.utils.OnItemClickListener<com.example.demomvvm.data.model.Pokemon> itemClickListener, @org.jetbrains.annotations.NotNull()
        com.example.demomvvm.screen.adapter.ItemPokemonViewModel itemViewModel) {
            super(null);
        }
    }
}