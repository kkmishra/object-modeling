package com.singtel.assignment.animal;

import com.singtel.assignment.BaseTest;
import org.junit.Test;

import static com.singtel.assignment.utils.Constants.FLY;
import static org.junit.Assert.assertEquals;

public class ButterFlyTest extends BaseTest {
  @Test
  public void shouldPrintFlyingForButterfly() throws Exception {
    ButterFly butterFly = new ButterFly(new Caterpillar());
    butterFly.fly();
    assertEquals(FLY + "\n", outContent.toString());
  }
}