package com.singtel.assignment;

import static com.singtel.assignment.Constants.DOG_SOUND;

public class Dog extends Animal {

  @Override
  public void sound() {
    System.out.println(DOG_SOUND);
  }
}
