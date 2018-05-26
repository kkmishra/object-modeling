package com.singtel.assignment;

import static com.singtel.assignment.Constants.CHICKEN_SOUND;
import static com.singtel.assignment.Constants.ROOSTER_SOUND;

public class Chicken extends Bird {

  private Type type;

  public Chicken(Type type) {
    this.type = type;
  }

  public void sound() {
    switch (type) {
      case CHICKEN:
        System.out.println(CHICKEN_SOUND);
        break;
      case ROOSTER:
        System.out.println(ROOSTER_SOUND);
    }
  }

  enum Type {
    CHICKEN,
    ROOSTER
  }
}
