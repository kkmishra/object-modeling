package org.kuldeep.modeling.animal;

import org.kuldeep.modeling.interfaces.MakeSound;

import static org.kuldeep.modeling.utils.Constants.DOG_SOUND;

public class Dog extends Animal implements MakeSound {

  public void sound() {
    System.out.println(DOG_SOUND);
  }
}
