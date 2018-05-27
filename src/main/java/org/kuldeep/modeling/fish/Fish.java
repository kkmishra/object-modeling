package org.kuldeep.modeling.fish;

import org.kuldeep.modeling.animal.Animal;
import org.kuldeep.modeling.interfaces.Swimming;
import org.kuldeep.modeling.utils.Constants;

import static org.kuldeep.modeling.utils.Constants.SWIM;

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
