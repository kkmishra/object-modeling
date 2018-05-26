package com.singtel.assignment;

import com.singtel.assignment.interfaces.MakeSound;

import static com.singtel.assignment.Constants.DEFAULT_ANIMAL_SOUND;

public class Animal implements MakeSound {

  void walk() {
    System.out.println(Constants.WALK);
  }

  public void sound() {
    System.out.println(DEFAULT_ANIMAL_SOUND);
  }

}
