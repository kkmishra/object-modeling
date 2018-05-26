package com.singtel.assignment;

import com.singtel.assignment.interfaces.Flying;
import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.Constants.FLY;
import static com.singtel.assignment.Constants.SING;
import static com.singtel.assignment.Constants.DEFAULT_ANIMAL_SOUND;

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

  @Test
  public void shouldPrintSoundString() throws Exception {
    Bird bird = new Bird();
    bird.sound();
    Assert.assertEquals(DEFAULT_ANIMAL_SOUND + "\n", outContent.toString());
  }

}