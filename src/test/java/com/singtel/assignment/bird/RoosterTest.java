package com.singtel.assignment.bird;

import com.singtel.assignment.BaseTest;
import com.singtel.assignment.bird.Chicken;
import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.bird.Chicken.Type.ROOSTER;
import static com.singtel.assignment.utils.Constants.ROOSTER_SOUND;

public class RoosterTest extends BaseTest {
  @Test
  public void shouldPrintRoosterSound() {
    Chicken rooster = new Chicken(ROOSTER);
    rooster.sound();
    Assert.assertEquals(ROOSTER_SOUND + "\n", outContent.toString());
  }
}