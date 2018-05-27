package org.kuldeep.modeling.animal;

import org.kuldeep.modeling.interfaces.Swimming;
import org.kuldeep.modeling.utils.Constants;

import static org.kuldeep.modeling.utils.Constants.SWIM;

public class Dolphins extends Animal implements Swimming {

  public void swim() {
    System.out.println(SWIM);
  }

  @Override
  public void walk() {
    System.out.println(Constants.DOLPHIN_WALK);
  }

  @Override
  public boolean canWalk() {
    return false;
  }

  @Override
  public boolean canSwim() {
    return true;
  }
}
