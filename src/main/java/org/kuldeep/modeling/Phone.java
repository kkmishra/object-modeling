package org.kuldeep.modeling;

import org.kuldeep.modeling.interfaces.MakeSound;

import static org.kuldeep.modeling.utils.Constants.PHONE_RING;

public class Phone implements MakeSound{

  public void sound() {
    System.out.println(PHONE_RING);
  }
}
