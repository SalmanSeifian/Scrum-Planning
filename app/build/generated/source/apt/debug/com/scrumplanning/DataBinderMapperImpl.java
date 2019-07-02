package com.scrumplanning;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.scrumplanning.databinding.FragmentCreateRoomBindingImpl;
import com.scrumplanning.databinding.FragmentJoinOrCreateBindingImpl;
import com.scrumplanning.databinding.FragmentJoinRoomBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTCREATEROOM = 1;

  private static final int LAYOUT_FRAGMENTJOINORCREATE = 2;

  private static final int LAYOUT_FRAGMENTJOINROOM = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.scrumplanning.R.layout.fragment_create_room, LAYOUT_FRAGMENTCREATEROOM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.scrumplanning.R.layout.fragment_join_or_create, LAYOUT_FRAGMENTJOINORCREATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.scrumplanning.R.layout.fragment_join_room, LAYOUT_FRAGMENTJOINROOM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTCREATEROOM: {
          if ("layout/fragment_create_room_0".equals(tag)) {
            return new FragmentCreateRoomBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_create_room is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTJOINORCREATE: {
          if ("layout/fragment_join_or_create_0".equals(tag)) {
            return new FragmentJoinOrCreateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_join_or_create is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTJOINROOM: {
          if ("layout/fragment_join_room_0".equals(tag)) {
            return new FragmentJoinRoomBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_join_room is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "joinRoomViewModel");
      sKeys.put(2, "createRoomViewModel");
      sKeys.put(3, "joinOrCreateViewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_create_room_0", com.scrumplanning.R.layout.fragment_create_room);
      sKeys.put("layout/fragment_join_or_create_0", com.scrumplanning.R.layout.fragment_join_or_create);
      sKeys.put("layout/fragment_join_room_0", com.scrumplanning.R.layout.fragment_join_room);
    }
  }
}
