// Generated by data binding compiler. Do not edit!
package com.example.demomvvm.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.demomvvm.R;
import com.example.demomvvm.screen.adapter.ItemPokemonViewModel;
import com.example.demomvvm.utils.customview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemPokemonBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageFavorite;

  @NonNull
  public final CircleImageView imagePokemon;

  @NonNull
  public final TextView textPokemonName;

  @Bindable
  protected ItemPokemonViewModel mViewModel;

  protected ItemPokemonBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageFavorite, CircleImageView imagePokemon, TextView textPokemonName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageFavorite = imageFavorite;
    this.imagePokemon = imagePokemon;
    this.textPokemonName = textPokemonName;
  }

  public abstract void setViewModel(@Nullable ItemPokemonViewModel viewModel);

  @Nullable
  public ItemPokemonViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ItemPokemonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_pokemon, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemPokemonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemPokemonBinding>inflateInternal(inflater, R.layout.item_pokemon, root, attachToRoot, component);
  }

  @NonNull
  public static ItemPokemonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_pokemon, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemPokemonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemPokemonBinding>inflateInternal(inflater, R.layout.item_pokemon, null, false, component);
  }

  public static ItemPokemonBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemPokemonBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemPokemonBinding)bind(component, view, R.layout.item_pokemon);
  }
}
