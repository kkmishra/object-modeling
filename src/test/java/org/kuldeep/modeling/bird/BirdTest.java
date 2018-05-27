package org.kuldeep.modeling.bird;

import org.kuldeep.modeling.BaseTest;
import org.kuldeep.modeling.interfaces.Flying;
import org.junit.Assert;
import org.junit.Test;

import static org.kuldeep.modeling.utils.Constants.FLY;
import static org.kuldeep.modeling.utils.Constants.SING;

public class BirdTest extends BaseTest {

  @Test
  public void shouldPrintFlyString() {
    Flying bird = new Flying() {
      public void fly() {
        System.out.println(FLY);
      }
    };
    bird.fly();
    Assert.assertEquals(FLY + "\n", outContent.toString());
  }

  @Test
  public void shouldPrintSingString() {
    Bird bird = new Bird();
    bird.sing();
    Assert.assertEquals(SING + "\n", outContent.toString());
  }
}