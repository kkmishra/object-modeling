package com.singtel.assignment.fish;

import com.singtel.assignment.interfaces.Swimming;

import static com.singtel.assignment.utils.Constants.SWIM;

public abstract class Fish implements Swimming {
  public void swim() {
    System.out.println(SWIM);
  }

  public abstract void type();
}
