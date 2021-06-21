package com.example.demomvvm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0007J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/example/demomvvm/utils/BindingUtil;", "", "()V", "setAdapter", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "setImageUrl", "imageView", "Landroid/widget/ImageView;", "url", "", "app_debug"})
public final class BindingUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.demomvvm.utils.BindingUtil INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"app:imageUrl"})
    public static final void setImageUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"app:adapter"})
    public static final void setAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter) {
    }
    
    private BindingUtil() {
        super();
    }
}