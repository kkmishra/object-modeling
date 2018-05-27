package com.singtel.assignment.animal;

import com.singtel.assignment.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.utils.Constants.WALK;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnimalTest extends BaseTest {

  @Test
  public void shouldPrintWalkString() {
    Animal animal = new Animal();
    animal.walk();
    Assert.assertEquals(WALK + "\n", outContent.toString());
  }

  @Test
  public void shouldTestWalkMethod() {
    Animal animal = new Animal();
    assertTrue(animal.canWalk());
  }

  @Test
  public void shouldTestFlyMethod() {
    Animal animal = new Animal();
    assertFalse(animal.canFly());
  }

  @Test
  public void shouldTestSwimMethod() {
    Animal animal = new Animal();
    assertFalse(animal.canSwim());
  }

  @Test
  public void shouldTestSingMethod() {
    Animal animal = new Animal();
    assertFalse(animal.canSing());
  }

  @Test
  public void shouldTestSoundMethod() {
    Animal animal = new Animal();
    assertTrue(animal.canMakeSound());
  }

}