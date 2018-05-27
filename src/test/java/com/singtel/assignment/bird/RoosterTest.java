package com.singtel.assignment.bird;

import com.singtel.assignment.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static com.singtel.assignment.bird.Chicken.Type.ROOSTER;
import static com.singtel.assignment.utils.Constants.ROOSTER_SOUND;

public class RoosterTest extends BaseTest {
  @Test
  public void shouldPrintRoosterSound() {
    Chicken rooster = new Chicken(ROOSTER);
    rooster.sound();
    Assert.assertEquals(ROOSTER_SOUND + "\n", outContent.toString());
  }

  @Test
  public void shouldPrintRoosterSoundInGerman() {
    System.setProperty("user.language", "de");
    System.setProperty("user.country", "DE");
    Chicken rooster = new Chicken(ROOSTER);
    rooster.sound();
    Assert.assertEquals("kikeriki" + "\n", outContent.toString());
  }

  @Test
  public void shouldPrintRoosterSoundInFrench() {
    System.setProperty("user.language", "fr");
    System.setProperty("user.country", "FR");
    Chicken rooster = new Chicken(ROOSTER);
    rooster.sound();
    Assert.assertEquals("cocorico" + "\n", outContent.toString());
  }
}