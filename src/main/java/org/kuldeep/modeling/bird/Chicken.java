package org.kuldeep.modeling.bird;

import org.kuldeep.modeling.interfaces.MakeSound;
import org.kuldeep.modeling.utils.Constants;
import org.kuldeep.modeling.utils.MessagePrinter;

public class Chicken extends Bird implements MakeSound {

  private Type type;

  public Chicken(Type type) {
    this.type = type;
  }

  public void sound() {
    switch (type) {
      case CHICKEN:
        MessagePrinter.printForKey("CHICKEN_SOUND");
        break;
      case ROOSTER:
        MessagePrinter.printForKey("ROOSTER_SOUND");
    }
  }

  @Override
  public void fly() {
    System.out.println(Constants.CHICKEN_FLY);
  }

  @Override
  public boolean canFly() {
    switch (type) {
      case CHICKEN:
        return false;
      case ROOSTER:
        return true;
    }
    return false;
  }

  public enum Type {
    CHICKEN,
    ROOSTER
  }
}
