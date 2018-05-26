package com.singtel.assignment.animal;

import static com.singtel.assignment.utils.Constants.DOG_SOUND;

public class Dog extends Animal {

  @Override
  public void sound() {
    System.out.println(DOG_SOUND);
  }
}
