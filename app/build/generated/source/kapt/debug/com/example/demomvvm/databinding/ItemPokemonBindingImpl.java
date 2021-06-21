package com.example.demomvvm.databinding;
import com.example.demomvvm.R;
import com.example.demomvvm.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPokemonBindingImpl extends ItemPokemonBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageFavorite, 3);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewModelOnItemClickedAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ItemPokemonBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemPokemonBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[3]
            , (com.example.demomvvm.utils.customview.CircleImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.imagePokemon.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.textPokemonName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.demomvvm.screen.adapter.ItemPokemonViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.demomvvm.screen.adapter.ItemPokemonViewModel ViewModel) {
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((com.example.demomvvm.screen.adapter.ItemPokemonViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.example.demomvvm.screen.adapter.ItemPokemonViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        else if (fieldId == BR.pokemon) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.view.View.OnClickListener viewModelOnItemClickedAndroidViewViewOnClickListener = null;
        com.example.demomvvm.data.model.Pokemon viewModelPokemon = null;
        com.example.demomvvm.screen.adapter.ItemPokemonViewModel viewModel = mViewModel;
        java.lang.String viewModelPokemonName = null;
        java.lang.String viewModelPokemonImageUrl = null;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x5L) != 0) {

                    if (viewModel != null) {
                        // read viewModel::onItemClicked
                        viewModelOnItemClickedAndroidViewViewOnClickListener = (((mViewModelOnItemClickedAndroidViewViewOnClickListener == null) ? (mViewModelOnItemClickedAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelOnItemClickedAndroidViewViewOnClickListener).setValue(viewModel));
                    }
            }

                if (viewModel != null) {
                    // read viewModel.pokemon
                    viewModelPokemon = viewModel.getPokemon();
                }


                if (viewModelPokemon != null) {
                    // read viewModel.pokemon.name
                    viewModelPokemonName = viewModelPokemon.getName();
                    // read viewModel.pokemon.imageUrl
                    viewModelPokemonImageUrl = viewModelPokemon.getImageUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.example.demomvvm.utils.BindingUtil.setImageUrl(this.imagePokemon, viewModelPokemonImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textPokemonName, viewModelPokemonName);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(viewModelOnItemClickedAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.example.demomvvm.screen.adapter.ItemPokemonViewModel value;
        public OnClickListenerImpl setValue(com.example.demomvvm.screen.adapter.ItemPokemonViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onItemClicked(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.pokemon
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}