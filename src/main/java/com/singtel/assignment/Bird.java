package com.singtel.assignment;

import static com.singtel.assignment.Constants.SOUND;

public class Bird extends Animal {

  public void sound() {
    System.out.println(SOUND);
  }

  public void sing() {
    System.out.println(Constants.SING);
  }
}
