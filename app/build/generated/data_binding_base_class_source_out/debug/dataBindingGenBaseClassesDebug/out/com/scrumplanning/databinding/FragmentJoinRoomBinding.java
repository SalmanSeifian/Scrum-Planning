package com.scrumplanning.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.scrumplanning.join.JoinRoomViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentJoinRoomBinding extends ViewDataBinding {
  @NonNull
  public final Button btnJoin;

  @NonNull
  public final EditText edtRoomDescription;

  @NonNull
  public final EditText edtRoomTitle;

  @NonNull
  public final TextView txtTitle;

  @Bindable
  protected JoinRoomViewModel mJoinRoomViewModel;

  protected FragmentJoinRoomBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnJoin, EditText edtRoomDescription, EditText edtRoomTitle, TextView txtTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnJoin = btnJoin;
    this.edtRoomDescription = edtRoomDescription;
    this.edtRoomTitle = edtRoomTitle;
    this.txtTitle = txtTitle;
  }

  public abstract void setJoinRoomViewModel(@Nullable JoinRoomViewModel joinRoomViewModel);

  @Nullable
  public JoinRoomViewModel getJoinRoomViewModel() {
    return mJoinRoomViewModel;
  }

  @NonNull
  public static FragmentJoinRoomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_join_room, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentJoinRoomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentJoinRoomBinding>inflateInternal(inflater, com.scrumplanning.R.layout.fragment_join_room, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentJoinRoomBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_join_room, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentJoinRoomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentJoinRoomBinding>inflateInternal(inflater, com.scrumplanning.R.layout.fragment_join_room, null, false, component);
  }

  public static FragmentJoinRoomBinding bind(@NonNull View view) {
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
  public static FragmentJoinRoomBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentJoinRoomBinding)bind(component, view, com.scrumplanning.R.layout.fragment_join_room);
  }
}
