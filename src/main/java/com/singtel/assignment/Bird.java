package com.singtel.assignment;

import static com.singtel.assignment.Constants.DEFAULT_BIRD_SOUND;

public class Bird extends Animal {

  public void sound() {
    System.out.println(DEFAULT_BIRD_SOUND);
  }

  public void sing() {
    System.out.println(Constants.SING);
  }
}
