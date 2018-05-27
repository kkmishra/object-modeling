package com.singtel.assignment.utils;

import com.singtel.assignment.animal.*;
import com.singtel.assignment.bird.Chicken;
import com.singtel.assignment.bird.Duck;
import com.singtel.assignment.fish.ClownFish;
import com.singtel.assignment.fish.Shark;
import org.junit.Test;

import static com.singtel.assignment.bird.Chicken.Type.CHICKEN;
import static com.singtel.assignment.bird.Chicken.Type.ROOSTER;
import static org.junit.Assert.assertEquals;

public class AnimalCounterTest {

  private final Caterpillar caterpillar = new Caterpillar();
  private Animal[] animals = {new Duck(), new Dog(), new Chicken(ROOSTER), new Chicken(CHICKEN)
    , new Shark(), new ClownFish(), new Dolphins(), new Cat(), new ButterFly(caterpillar), caterpillar};
  AnimalCounter animalCounter = new AnimalCounter(animals);

  @Test
  public void numberOfAnimalCanFly() {
    int count = animalCounter.numberOfAnimalCanFly();
    assertEquals(4, count);
  }

  @Test
  public void numberOfAnimalCanWalk() {
    int count = animalCounter.numberOfAnimalCanWalk();
    assertEquals(7, count);
  }

  @Test
  public void numberOfAnimalCanSing() {
    int count = animalCounter.numberOfAnimalCanSing();
    assertEquals(3, count);
  }

  @Test
  public void numberOfAnimalCanSwim() {
    int count = animalCounter.numberOfAnimalCanSwim();
    assertEquals(4, count);
  }

}