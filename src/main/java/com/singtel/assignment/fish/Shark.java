package com.singtel.assignment.fish;

import com.singtel.assignment.interfaces.Cannibal;
import com.singtel.assignment.utils.Constants;

public class Shark extends Fish implements Cannibal {

  public void type() {
    System.out.println(Constants.SHARK_TYPE);
  }
}
