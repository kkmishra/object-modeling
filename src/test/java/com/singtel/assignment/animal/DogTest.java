package com.singtel.assignment.animal;

import com.singtel.assignment.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.utils.Constants.DOG_SOUND;

public class DogTest extends BaseTest {

  @Test
  public void shouldPrintDogSound() {
    Dog dog = new Dog();
    dog.sound();
    Assert.assertEquals(DOG_SOUND + "\n", outContent.toString());
  }
}