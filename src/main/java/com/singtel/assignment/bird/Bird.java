package com.singtel.assignment.bird;

import com.singtel.assignment.animal.Animal;
import com.singtel.assignment.interfaces.Flying;
import com.singtel.assignment.utils.Constants;

public class Bird extends Animal implements Flying {

  public void sing() {
    System.out.println(Constants.SING);
  }

  public void fly() {
    System.out.println("I am flying");
  }
}
