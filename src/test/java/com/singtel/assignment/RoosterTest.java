package com.singtel.assignment;

import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.Constants.ROOSTER_SOUND;
import static com.singtel.assignment.Constants.SWIM;
import static org.junit.Assert.*;

public class RoosterTest extends BaseTest {
  @Test
  public void shouldPrintRoosterSound() {
    Rooster rooster = new Rooster();
    rooster.sound();
    Assert.assertEquals(ROOSTER_SOUND + "\n", outContent.toString());
  }
}