package org.kuldeep.modeling.bird;

import org.kuldeep.modeling.interfaces.MakeSound;

public class Parrot extends Bird implements MakeSound {
  private MakeSound neighbor;

  public void sound() {
    neighbor.sound();
  }

  public void setNeighbor(MakeSound neighbor) {
    this.neighbor = neighbor;
  }
}
