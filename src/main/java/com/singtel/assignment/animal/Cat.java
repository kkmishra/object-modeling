package com.singtel.assignment.animal;

import com.singtel.assignment.interfaces.MakeSound;

import static com.singtel.assignment.utils.Constants.CAT_SOUND;

public class Cat extends Animal implements MakeSound {

  public void sound() {
    System.out.println(CAT_SOUND);
  }
}
