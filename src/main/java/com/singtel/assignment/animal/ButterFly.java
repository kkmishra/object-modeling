package com.singtel.assignment.animal;

import com.singtel.assignment.interfaces.Flying;

import static com.singtel.assignment.utils.Constants.FLY;

public class ButterFly extends Animal implements Flying {
  public void fly() {
    System.out.println(FLY);
  }
}
