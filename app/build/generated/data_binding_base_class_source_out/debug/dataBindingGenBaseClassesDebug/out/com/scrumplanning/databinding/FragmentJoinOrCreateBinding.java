package com.scrumplanning.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.scrumplanning.joinorcreate.JoinOrCreateViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentJoinOrCreateBinding extends ViewDataBinding {
  @NonNull
  public final Button createButton;

  @NonNull
  public final Button joinButton;

  @Bindable
  protected JoinOrCreateViewModel mJoinOrCreateViewModel;

  protected FragmentJoinOrCreateBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button createButton, Button joinButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.createButton = createButton;
    this.joinButton = joinButton;
  }

  public abstract void setJoinOrCreateViewModel(@Nullable JoinOrCreateViewModel joinOrCreateViewModel);

  @Nullable
  public JoinOrCreateViewModel getJoinOrCreateViewModel() {
    return mJoinOrCreateViewModel;
  }

  @NonNull
  public static FragmentJoinOrCreateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_join_or_create, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentJoinOrCreateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentJoinOrCreateBinding>inflateInternal(inflater, com.scrumplanning.R.layout.fragment_join_or_create, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentJoinOrCreateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_join_or_create, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentJoinOrCreateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentJoinOrCreateBinding>inflateInternal(inflater, com.scrumplanning.R.layout.fragment_join_or_create, null, false, component);
  }

  public static FragmentJoinOrCreateBinding bind(@NonNull View view) {
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
  public static FragmentJoinOrCreateBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentJoinOrCreateBinding)bind(component, view, com.scrumplanning.R.layout.fragment_join_or_create);
  }
}
