package org.kuldeep.modeling.fish;

import org.kuldeep.modeling.interfaces.Cannibal;

import static org.kuldeep.modeling.utils.Constants.SHARK_TYPE;

public class Shark extends Fish implements Cannibal {

  public void type() {
    System.out.println(SHARK_TYPE);
  }
}
