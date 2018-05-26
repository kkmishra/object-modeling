package com.singtel.assignment;

import static com.singtel.assignment.Constants.CAT_SOUND;

public class Cat extends Animal {

  @Override
  public void sound() {
    System.out.println(CAT_SOUND);
  }
}
