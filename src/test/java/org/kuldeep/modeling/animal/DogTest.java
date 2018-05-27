package org.kuldeep.modeling.animal;

import org.kuldeep.modeling.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static org.kuldeep.modeling.utils.Constants.DOG_SOUND;

public class DogTest extends BaseTest {

  @Test
  public void shouldPrintDogSound() {
    Dog dog = new Dog();
    dog.sound();
    Assert.assertEquals(DOG_SOUND + "\n", outContent.toString());
  }
}