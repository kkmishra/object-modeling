package com.singtel.assignment.bird;

import com.singtel.assignment.interfaces.MakeSound;
import com.singtel.assignment.utils.Constants;

import static com.singtel.assignment.utils.MessagePrinter.printForKey;

public class Chicken extends Bird implements MakeSound {

  private Type type;

  public Chicken(Type type) {
    this.type = type;
  }

  public void sound() {
    switch (type) {
      case CHICKEN:
        printForKey("CHICKEN_SOUND");
        break;
      case ROOSTER:
        printForKey("ROOSTER_SOUND");
    }
  }

  @Override
  public void fly() {
    System.out.println(Constants.CHICKEN_FLY);
  }

  @Override
  public boolean canFly() {
    return false;
  }

  public enum Type {
    CHICKEN,
    ROOSTER
  }
}
