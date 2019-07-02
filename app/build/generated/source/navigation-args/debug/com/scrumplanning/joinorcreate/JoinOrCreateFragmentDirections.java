package com.scrumplanning.joinorcreate;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.scrumplanning.R;

public class JoinOrCreateFragmentDirections {
  private JoinOrCreateFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionJoinOrCreateFragmentToCreateRoomFragment() {
    return new ActionOnlyNavDirections(R.id.action_joinOrCreateFragment_to_createRoomFragment);
  }

  @NonNull
  public static NavDirections actionJoinOrCreateFragmentToJoinRoomFragment() {
    return new ActionOnlyNavDirections(R.id.action_joinOrCreateFragment_to_joinRoomFragment);
  }
}
