package org.kuldeep.modeling.bird;

import org.kuldeep.modeling.BaseTest;
import org.kuldeep.modeling.interfaces.Swimming;
import org.junit.Assert;
import org.junit.Test;

import static org.kuldeep.modeling.utils.Constants.DUCK_SOUND;
import static org.kuldeep.modeling.utils.Constants.SWIM;
import static org.junit.Assert.assertTrue;

public class DuckTest extends BaseTest {

  @Test
  public void shouldPrintChickenSound() {
    Duck duck = new Duck();
    duck.sound();
    Assert.assertEquals(DUCK_SOUND + "\n", outContent.toString());
  }

  @Test
  public void shouldPrintSwim() {
    Duck duck = new Duck();
    duck.swim();
    Assert.assertEquals(SWIM + "\n", outContent.toString());
  }

  @Test
  public void shouldCheckThatDuckCanSwim() {
    assertTrue(Swimming.class.isAssignableFrom(Duck.class));
  }
}