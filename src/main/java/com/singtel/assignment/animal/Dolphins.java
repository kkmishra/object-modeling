package com.singtel.assignment.animal;

import com.singtel.assignment.interfaces.Swimming;
import com.singtel.assignment.utils.Constants;

import static com.singtel.assignment.utils.Constants.SWIM;

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
