package com.singtel.assignment.animal;

import com.singtel.assignment.utils.Constants;

public class Caterpillar extends Animal {

  @Override
  public void walk() {
    System.out.println(Constants.CATERPILLAR_WALK);
  }
}
