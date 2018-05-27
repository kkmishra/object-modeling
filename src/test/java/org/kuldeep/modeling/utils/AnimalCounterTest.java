package org.kuldeep.modeling.utils;

import org.kuldeep.modeling.animal.*;
import org.kuldeep.modeling.bird.Chicken;
import org.kuldeep.modeling.bird.Duck;
import org.kuldeep.modeling.fish.ClownFish;
import org.kuldeep.modeling.fish.Shark;
import org.kuldeep.modeling.utils.AnimalCounter;
import org.junit.Test;

import static org.kuldeep.modeling.bird.Chicken.Type.CHICKEN;
import static org.kuldeep.modeling.bird.Chicken.Type.ROOSTER;
import static org.junit.Assert.assertEquals;

public class AnimalCounterTest {

  private final Caterpillar caterpillar = new Caterpillar();
  private Animal[] animals = {new Duck(), new Dog(), new Chicken(ROOSTER), new Chicken(CHICKEN)
    , new Shark(), new ClownFish(), new Dolphins(), new Cat(), new ButterFly(caterpillar), caterpillar};
  AnimalCounter animalCounter = new AnimalCounter(animals);

  @Test
  public void numberOfAnimalCanFly() {
    int count = animalCounter.numberOfAnimalCanFly();
    assertEquals(3, count);
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