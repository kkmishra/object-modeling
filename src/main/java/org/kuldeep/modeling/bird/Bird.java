package org.kuldeep.modeling.bird;

import org.kuldeep.modeling.animal.Animal;
import org.kuldeep.modeling.interfaces.Flying;
import org.kuldeep.modeling.interfaces.Singer;
import org.kuldeep.modeling.utils.Constants;

public class Bird extends Animal implements Flying, Singer {

  public void sing() {
    System.out.println(Constants.SING);
  }

  public void fly() {
    System.out.println("I am flying");
  }

  @Override
  public boolean canSing() {
    return true;
  }

  @Override
  public boolean canFly() {
    return true;
  }
}
