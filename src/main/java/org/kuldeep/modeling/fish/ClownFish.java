package org.kuldeep.modeling.fish;

import org.kuldeep.modeling.interfaces.MakeJoke;
import org.kuldeep.modeling.utils.Constants;

import static org.kuldeep.modeling.utils.Constants.JOKE;

public class ClownFish extends Fish implements MakeJoke {

  public void type() {
    System.out.println(Constants.CLOWNFISH_TYPE);
  }

  public void makeJoke() {
    System.out.println(JOKE);
  }
}
