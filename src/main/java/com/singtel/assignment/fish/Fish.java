package com.singtel.assignment.fish;

import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.interfaces.Swimming;
import com.singtel.assignment.utils.Constants;

import static com.singtel.assignment.utils.Constants.SWIM;

public abstract class Fish extends Animal implements Swimming {

  public void swim() {
    System.out.println(SWIM);
  }

  public void walk() {
    System.out.println(Constants.FISH_WALK);
  }

  public abstract void type();

  @Override
  public boolean canSwim() {
    return true;
  }

  @Override
  public boolean canWalk() {
    return false;
  }

  @Override
  public boolean canSing() {
    return false;
  }
}
