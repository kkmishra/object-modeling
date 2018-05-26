package com.singtel.assignment.animal;

import static com.singtel.assignment.utils.Constants.CATERPILLAR_WALK;

public class Caterpillar extends Animal {

  @Override
  public void walk() {
    System.out.println(CATERPILLAR_WALK);
  }

  public ButterFly metamorphosis() {
    return new ButterFly(this);
  }
}
