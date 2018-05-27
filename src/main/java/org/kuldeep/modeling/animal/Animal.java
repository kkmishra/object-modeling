package org.kuldeep.modeling.animal;

import org.kuldeep.modeling.interfaces.Walker;
import org.kuldeep.modeling.utils.Constants;

public class Animal implements Walker {
  public void walk() {
    System.out.println(Constants.WALK);
  }

  public boolean canSwim() {
    return false;
  }

  public boolean canSing() {
    return false;
  }

  public boolean canWalk() {
    return true;
  }

  public boolean canFly() {
    return false;
  }

  public boolean canMakeSound() {
    return true;
  }
}
