package com.singtel.assignment.fish;

import com.singtel.assignment.interfaces.MakeJoke;
import com.singtel.assignment.utils.Constants;

public class Clownfish extends Fish implements MakeJoke {

  public void type() {
    System.out.println(Constants.CLOWNFISH_TYPE);
  }
}
