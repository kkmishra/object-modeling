package com.singtel.assignment.animal;

import com.singtel.assignment.interfaces.MakeSound;

import static com.singtel.assignment.utils.Constants.DOG_SOUND;

public class Dog extends Animal implements MakeSound {

  @Override
  public void sound() {
    System.out.println(DOG_SOUND);
  }
}
