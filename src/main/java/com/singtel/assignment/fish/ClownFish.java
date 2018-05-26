package com.singtel.assignment.fish;

import com.singtel.assignment.interfaces.MakeJoke;
import com.singtel.assignment.utils.Constants;

import static com.singtel.assignment.utils.Constants.JOKE;

public class ClownFish extends Fish implements MakeJoke {

  public void type() {
    System.out.println(Constants.CLOWNFISH_TYPE);
  }

  public void makeJoke() {
    System.out.println(JOKE);
  }
}
