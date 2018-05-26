package com.singtel.assignment.animal;

import com.singtel.assignment.interfaces.Swimming;

import static com.singtel.assignment.utils.Constants.SWIM;

public class Dolphins implements Swimming {
  public void swim() {
    System.out.println(SWIM);
  }
}
