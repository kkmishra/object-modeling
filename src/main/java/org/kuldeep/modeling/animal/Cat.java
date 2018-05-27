package org.kuldeep.modeling.animal;

import org.kuldeep.modeling.interfaces.MakeSound;

import static org.kuldeep.modeling.utils.Constants.CAT_SOUND;

public class Cat extends Animal implements MakeSound {

  public void sound() {
    System.out.println(CAT_SOUND);
  }
}
