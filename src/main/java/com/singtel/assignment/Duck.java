package com.singtel.assignment;

import com.singtel.assignment.interfaces.Swimming;

import static com.singtel.assignment.Constants.DUCK_SOUND;
import static com.singtel.assignment.Constants.SWIM;

public class Duck extends Bird implements Swimming {

  public void sound() {
    System.out.println(DUCK_SOUND);
  }

  public void swim() {
    System.out.println(SWIM);
  }

}
