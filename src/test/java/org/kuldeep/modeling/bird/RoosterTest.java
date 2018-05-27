package org.kuldeep.modeling.bird;

import org.kuldeep.modeling.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static org.kuldeep.modeling.bird.Chicken.Type.ROOSTER;
import static org.kuldeep.modeling.utils.Constants.ROOSTER_SOUND;

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
    resetLocale();
  }

  @Test
  public void shouldPrintRoosterSoundInFrench() {
    System.setProperty("user.language", "fr");
    System.setProperty("user.country", "FR");
    Chicken rooster = new Chicken(ROOSTER);
    rooster.sound();
    Assert.assertEquals("cocorico" + "\n", outContent.toString());
    resetLocale();
  }

  private void resetLocale() {
    System.setProperty("user.language", "en");
    System.setProperty("user.country", "IN");
  }
}