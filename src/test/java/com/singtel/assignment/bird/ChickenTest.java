package com.singtel.assignment.bird;

import com.singtel.assignment.BaseTest;
import com.singtel.assignment.bird.Chicken;
import com.singtel.assignment.interfaces.Swimming;
import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.bird.Chicken.Type.CHICKEN;
import static com.singtel.assignment.utils.Constants.CHICKEN_SOUND;
import static org.junit.Assert.*;

public class ChickenTest extends BaseTest {
  @Test
  public void shouldPrintChickenSound() throws Exception {
    Chicken chicken = new Chicken(CHICKEN);
    chicken.sound();
    Assert.assertEquals(CHICKEN_SOUND + "\n", outContent.toString());
  }

  @Test
  public void shouldChickenCanNotSwim() throws Exception {
    assertFalse(Swimming.class.isAssignableFrom(Chicken.class));
  }

}