package com.singtel.assignment.animal;

import com.singtel.assignment.interfaces.MakeSound;
import com.singtel.assignment.utils.Constants;

import static com.singtel.assignment.utils.Constants.DEFAULT_ANIMAL_SOUND;

public class Animal implements MakeSound {

  public void walk() {
    System.out.println(Constants.WALK);
  }

  public void sound() {
    System.out.println(DEFAULT_ANIMAL_SOUND);
  }

}
