package com.singtel.assignment.bird;

import com.singtel.assignment.BaseTest;
import com.singtel.assignment.interfaces.Swimming;
import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.bird.Chicken.Type.CHICKEN;
import static com.singtel.assignment.utils.Constants.CHICKEN_FLY;
import static com.singtel.assignment.utils.Constants.CHICKEN_SOUND;
import static org.junit.Assert.assertFalse;

public class ChickenTest extends BaseTest {
  @Test
  public void shouldPrintChickenSound() {
    Chicken chicken = new Chicken(CHICKEN);
    chicken.sound();
    Assert.assertEquals(CHICKEN_SOUND + "\n", outContent.toString());
  }

  @Test
  public void shouldChickenCanNotSwim() {
    assertFalse(Swimming.class.isAssignableFrom(Chicken.class));
  }

  @Test
  public void shouldNotWalk() {
    Chicken chicken = new Chicken(CHICKEN);
    chicken.fly();
    Assert.assertEquals(CHICKEN_FLY + "\n", outContent.toString());
  }
}