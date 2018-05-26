package com.singtel.assignment;

import com.singtel.assignment.interfaces.MakeSound;

public class Parrot extends Bird {
  private MakeSound neighbor;

  public void sound() {
    neighbor.sound();
  }

  public void setNeighbor(MakeSound neighbor) {
    this.neighbor = neighbor;
  }
}
