package com.singtel.assignment;

import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.Constants.CAT_SOUND;
import static com.singtel.assignment.Constants.DOG_SOUND;
import static org.junit.Assert.*;

public class DogTest extends BaseTest {

  @Test
  public void shouldPrintDogSound() {
    Dog dog = new Dog();
    dog.sound();
    Assert.assertEquals(DOG_SOUND + "\n", outContent.toString());
  }
}