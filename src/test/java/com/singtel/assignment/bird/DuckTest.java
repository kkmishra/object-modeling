package com.singtel.assignment.bird;

import com.singtel.assignment.BaseTest;
import com.singtel.assignment.bird.Duck;
import com.singtel.assignment.interfaces.Swimming;
import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.utils.Constants.DUCK_SOUND;
import static com.singtel.assignment.utils.Constants.SWIM;
import static org.junit.Assert.*;

public class DuckTest extends BaseTest {

  @Test
  public void shouldPrintChickenSound() throws Exception {
    Duck duck = new Duck();
    duck.sound();
    Assert.assertEquals(DUCK_SOUND + "\n", outContent.toString());
  }

  @Test
  public void shouldPrintSwim() throws Exception {
    Duck duck = new Duck();
    duck.swim();
    Assert.assertEquals(SWIM + "\n", outContent.toString());
  }

  @Test
  public void shouldCheckThatDuckCanSwim() throws Exception {
    assertTrue(Swimming.class.isAssignableFrom(Duck.class));
  }
}