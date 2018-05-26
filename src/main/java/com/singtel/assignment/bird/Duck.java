package com.singtel.assignment.bird;

import com.singtel.assignment.interfaces.MakeSound;
import com.singtel.assignment.interfaces.Swimming;

import static com.singtel.assignment.utils.Constants.DUCK_SOUND;
import static com.singtel.assignment.utils.Constants.SWIM;

public class Duck extends Bird implements Swimming, MakeSound {

  public void sound() {
    System.out.println(DUCK_SOUND);
  }

  public void swim() {
    System.out.println(SWIM);
  }

}
