package com.singtel.assignment.animal;

import com.singtel.assignment.interfaces.Walker;
import com.singtel.assignment.utils.Constants;

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
