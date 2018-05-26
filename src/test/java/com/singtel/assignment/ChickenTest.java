package com.singtel.assignment;

import com.singtel.assignment.interfaces.Swimming;
import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.Constants.CHICKEN_SOUND;
import static com.singtel.assignment.Constants.SING;
import static org.junit.Assert.*;

public class ChickenTest extends BaseTest {
  @Test
  public void shouldPrintChickenSound() throws Exception {
    Chicken chicken = new Chicken();
    chicken.sound();
    Assert.assertEquals(CHICKEN_SOUND + "\n", outContent.toString());
  }

  @Test
  public void shouldChickenCanNotSwim() throws Exception {
    assertFalse(Swimming.class.isAssignableFrom(Chicken.class));
  }

}