package com.singtel.assignment;

public class Parrot extends Bird {
  private Animal neighbor;

  public void sound() {
    neighbor.sound();
  }

  public void setNeighbor(Animal neighbor) {
    this.neighbor = neighbor;
  }
}
