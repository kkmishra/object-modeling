package org.kuldeep.modeling.bird;

import org.kuldeep.modeling.BaseTest;
import org.kuldeep.modeling.Phone;
import org.kuldeep.modeling.animal.Cat;
import org.kuldeep.modeling.animal.Dog;
import org.junit.Assert;
import org.junit.Test;

import static org.kuldeep.modeling.bird.Chicken.Type.ROOSTER;
import static org.kuldeep.modeling.utils.Constants.*;

public class ParrotTest extends BaseTest {
  @Test
  public void shouldMakeSoundLikeDog() {
    Parrot parrot = new Parrot();
    parrot.setNeighbor(new Dog());
    parrot.sound();
    Assert.assertEquals(DOG_SOUND + "\n", outContent.toString());
  }

  @Test
  public void shouldMakeSoundLikeCat() {
    Parrot parrot = new Parrot();
    parrot.setNeighbor(new Cat());
    parrot.sound();
    Assert.assertEquals(CAT_SOUND + "\n", outContent.toString());
  }

  @Test
  public void shouldMakeSoundLikeRooster() {
    Parrot parrot = new Parrot();
    parrot.setNeighbor(new Chicken(ROOSTER));
    parrot.sound();
    Assert.assertEquals(ROOSTER_SOUND + "\n", outContent.toString());
  }

  @Test
  public void shouldMakeSoundLikeDuck() {
    Parrot parrot = new Parrot();
    parrot.setNeighbor(new Duck());
    parrot.sound();
    Assert.assertEquals(DUCK_SOUND + "\n", outContent.toString());
  }

  @Test
  public void shouldMakeSoundLikePhone() {
    Parrot parrot = new Parrot();
    parrot.setNeighbor(new Phone());
    parrot.sound();
    Assert.assertEquals(PHONE_RING + "\n", outContent.toString());
  }

}