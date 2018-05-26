package com.singtel.assignment;

import com.singtel.assignment.interfaces.MakeSound;

import static com.singtel.assignment.Constants.PHONE_RING;

public class Phone implements MakeSound{

  public void sound() {
    System.out.println(PHONE_RING);
  }
}
