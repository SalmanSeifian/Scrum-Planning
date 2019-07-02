package com.scrumplanning.databinding;
import com.scrumplanning.R;
import com.scrumplanning.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentJoinOrCreateBindingImpl extends FragmentJoinOrCreateBinding implements com.scrumplanning.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentJoinOrCreateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentJoinOrCreateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[1]
            );
        this.createButton.setTag(null);
        this.joinButton.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.scrumplanning.generated.callback.OnClickListener(this, 1);
        mCallback4 = new com.scrumplanning.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.joinOrCreateViewModel == variableId) {
            setJoinOrCreateViewModel((com.scrumplanning.joinorcreate.JoinOrCreateViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setJoinOrCreateViewModel(@Nullable com.scrumplanning.joinorcreate.JoinOrCreateViewModel JoinOrCreateViewModel) {
        this.mJoinOrCreateViewModel = JoinOrCreateViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.joinOrCreateViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.scrumplanning.joinorcreate.JoinOrCreateViewModel joinOrCreateViewModel = mJoinOrCreateViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.createButton.setOnClickListener(mCallback4);
            this.joinButton.setOnClickListener(mCallback3);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // joinOrCreateViewModel != null
                boolean joinOrCreateViewModelJavaLangObjectNull = false;
                // joinOrCreateViewModel
                com.scrumplanning.joinorcreate.JoinOrCreateViewModel joinOrCreateViewModel = mJoinOrCreateViewModel;



                joinOrCreateViewModelJavaLangObjectNull = (joinOrCreateViewModel) != (null);
                if (joinOrCreateViewModelJavaLangObjectNull) {


                    joinOrCreateViewModel.onJoin();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // joinOrCreateViewModel != null
                boolean joinOrCreateViewModelJavaLangObjectNull = false;
                // joinOrCreateViewModel
                com.scrumplanning.joinorcreate.JoinOrCreateViewModel joinOrCreateViewModel = mJoinOrCreateViewModel;



                joinOrCreateViewModelJavaLangObjectNull = (joinOrCreateViewModel) != (null);
                if (joinOrCreateViewModelJavaLangObjectNull) {


                    joinOrCreateViewModel.onCreate();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): joinOrCreateViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}