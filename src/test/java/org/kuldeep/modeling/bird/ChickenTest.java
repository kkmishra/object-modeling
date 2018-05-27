package org.kuldeep.modeling.bird;

import org.kuldeep.modeling.BaseTest;
import org.kuldeep.modeling.interfaces.Swimming;
import org.junit.Assert;
import org.junit.Test;

import static org.kuldeep.modeling.bird.Chicken.Type.CHICKEN;
import static org.kuldeep.modeling.utils.Constants.CHICKEN_FLY;
import static org.kuldeep.modeling.utils.Constants.CHICKEN_SOUND;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

  @Test
  public void shouldTestCanFlyMethod() {
    Chicken chicken = new Chicken(CHICKEN);
    assertFalse(chicken.canFly());
  }
}