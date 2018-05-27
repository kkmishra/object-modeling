package org.kuldeep.modeling.bird;

import org.kuldeep.modeling.interfaces.MakeSound;
import org.kuldeep.modeling.interfaces.Swimming;

import static org.kuldeep.modeling.utils.Constants.DUCK_SOUND;
import static org.kuldeep.modeling.utils.Constants.SWIM;

public class Duck extends Bird implements Swimming, MakeSound {

  public void sound() {
    System.out.println(DUCK_SOUND);
  }

  public void swim() {
    System.out.println(SWIM);
  }

  @Override
  public boolean canSwim() {
    return true;
  }
}
