package com.singtel.assignment.bird;

import com.singtel.assignment.interfaces.MakeSound;

import static com.singtel.assignment.utils.Constants.CHICKEN_SOUND;
import static com.singtel.assignment.utils.Constants.ROOSTER_SOUND;

public class Chicken extends Bird implements MakeSound{

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

  public enum Type {
    CHICKEN,
    ROOSTER
  }
}
