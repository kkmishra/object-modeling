package com.singtel.assignment.fish;

import com.singtel.assignment.interfaces.Cannibal;
import com.singtel.assignment.utils.Constants;

import static com.singtel.assignment.utils.Constants.SHARK_TYPE;

public class Shark extends Fish implements Cannibal {

  public void type() {
    System.out.println(SHARK_TYPE);
  }
}
