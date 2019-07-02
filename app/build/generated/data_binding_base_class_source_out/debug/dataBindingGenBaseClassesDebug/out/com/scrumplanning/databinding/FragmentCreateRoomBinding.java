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
import com.scrumplanning.create.CreateRoomViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCreateRoomBinding extends ViewDataBinding {
  @NonNull
  public final Button btnCreate;

  @NonNull
  public final EditText edtCreatorName;

  @NonNull
  public final EditText edtRoomDescription;

  @NonNull
  public final EditText edtRoomTitle;

  @NonNull
  public final TextView txtTitle;

  @Bindable
  protected CreateRoomViewModel mCreateRoomViewModel;

  protected FragmentCreateRoomBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnCreate, EditText edtCreatorName, EditText edtRoomDescription, EditText edtRoomTitle,
      TextView txtTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnCreate = btnCreate;
    this.edtCreatorName = edtCreatorName;
    this.edtRoomDescription = edtRoomDescription;
    this.edtRoomTitle = edtRoomTitle;
    this.txtTitle = txtTitle;
  }

  public abstract void setCreateRoomViewModel(@Nullable CreateRoomViewModel createRoomViewModel);

  @Nullable
  public CreateRoomViewModel getCreateRoomViewModel() {
    return mCreateRoomViewModel;
  }

  @NonNull
  public static FragmentCreateRoomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_create_room, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCreateRoomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCreateRoomBinding>inflateInternal(inflater, com.scrumplanning.R.layout.fragment_create_room, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCreateRoomBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_create_room, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCreateRoomBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCreateRoomBinding>inflateInternal(inflater, com.scrumplanning.R.layout.fragment_create_room, null, false, component);
  }

  public static FragmentCreateRoomBinding bind(@NonNull View view) {
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
  public static FragmentCreateRoomBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentCreateRoomBinding)bind(component, view, com.scrumplanning.R.layout.fragment_create_room);
  }
}
