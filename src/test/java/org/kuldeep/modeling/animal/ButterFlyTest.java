package org.kuldeep.modeling.animal;

import org.kuldeep.modeling.BaseTest;
import org.junit.Test;

import static org.kuldeep.modeling.utils.Constants.FLY;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ButterFlyTest extends BaseTest {
  @Test
  public void shouldPrintFlyingForButterfly() {
    ButterFly butterFly = new ButterFly(new Caterpillar());
    butterFly.fly();
    assertEquals(FLY + "\n", outContent.toString());
  }

  @Test
  public void shouldTestThatButterflyCanNotMakeSound() {
    ButterFly butterFly = new ButterFly(new Caterpillar());
    assertFalse(butterFly.canMakeSound());
  }
}