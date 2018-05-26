package com.singtel.assignment;

import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.Constants.FLY;
import static com.singtel.assignment.Constants.SING;

public class BirdTest extends BaseTest {
  @Test
  public void shouldPrintFlyString() throws Exception {
    Bird bird = new Bird();
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