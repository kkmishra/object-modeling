package com.singtel.assignment;

import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.Chicken.Type.ROOSTER;
import static com.singtel.assignment.Constants.ROOSTER_SOUND;

public class RoosterTest extends BaseTest {
  @Test
  public void shouldPrintRoosterSound() {
    Chicken rooster = new Chicken(ROOSTER);
    rooster.sound();
    Assert.assertEquals(ROOSTER_SOUND + "\n", outContent.toString());
  }
}