package com.singtel.assignment.bird;

import com.singtel.assignment.BaseTest;
import com.singtel.assignment.bird.Bird;
import com.singtel.assignment.interfaces.Flying;
import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.utils.Constants.FLY;
import static com.singtel.assignment.utils.Constants.SING;
import static com.singtel.assignment.utils.Constants.DEFAULT_ANIMAL_SOUND;

public class BirdTest extends BaseTest {

  @Test
  public void shouldPrintFlyString() throws Exception {
    Flying bird = new Flying() {
      public void fly() {
        System.out.println(FLY);
      }
    };
    bird.fly();
    Assert.assertEquals(FLY + "\n", outContent.toString());
  }

  @Test
  public void shouldPrintSingString() throws Exception {
    Bird bird = new Bird();
    bird.sing();
    Assert.assertEquals(SING + "\n", outContent.toString());
  }
}