package com.singtel.assignment.utils;

import com.singtel.assignment.animal.Animal;

public class AnimalCounter {
  private Animal[] animals;

  public AnimalCounter(Animal[] animals) {
    this.animals = animals;
  }

  public int numberOfAnimalCanFly() {
    int count = 0;
    for (Animal animal : animals) {
      if (animal.canFly()) {
        count++;
      }
    }
    return count;
  }

  public int numberOfAnimalCanWalk() {
    int count = 0;
    for (Animal animal : animals) {
      if (animal.canWalk()) {
        count++;
      }
    }
    return count;
  }

  public int numberOfAnimalCanSing() {
    int count = 0;
    for (Animal animal : animals) {
      if (animal.canSing()) {
        count++;
      }
    }
    return count;
  }

  public int numberOfAnimalCanSwim() {
    int count = 0;
    for (Animal animal : animals) {
      if (animal.canSwim()) {
        count++;
      }
    }
    return count;
  }
}
