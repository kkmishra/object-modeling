package com.singtel.assignment.animal;

import static com.singtel.assignment.utils.Constants.CAT_SOUND;

public class Cat extends Animal {

  @Override
  public void sound() {
    System.out.println(CAT_SOUND);
  }
}
