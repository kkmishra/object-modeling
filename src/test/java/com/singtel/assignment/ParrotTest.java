package com.singtel.assignment;

import com.singtel.assignment.Chicken.Type;
import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.Chicken.Type.ROOSTER;
import static com.singtel.assignment.Constants.*;
import static org.junit.Assert.*;

public class ParrotTest extends BaseTest {
  @Test
  public void shouldMakeSoundLikeDog() throws Exception {
    Parrot parrot = new Parrot();
    parrot.setNeighbor(new Dog());
    parrot.sound();
    Assert.assertEquals(DOG_SOUND + "\n", outContent.toString());
  }

  @Test
  public void shouldMakeSoundLikeCat() throws Exception {
    Parrot parrot = new Parrot();
    parrot.setNeighbor(new Cat());
    parrot.sound();
    Assert.assertEquals(CAT_SOUND + "\n", outContent.toString());
  }

  @Test
  public void shouldMakeSoundLikeRooster() throws Exception {
    Parrot parrot = new Parrot();
    parrot.setNeighbor(new Chicken(ROOSTER));
    parrot.sound();
    Assert.assertEquals(ROOSTER_SOUND + "\n", outContent.toString());
  }

  @Test
  public void shouldMakeSoundLikeDuck() throws Exception {
    Parrot parrot = new Parrot();
    parrot.setNeighbor(new Duck());
    parrot.sound();
    Assert.assertEquals(DUCK_SOUND + "\n", outContent.toString());
  }

  @Test
  public void shouldMakeSoundLikePhone() throws Exception {
    Parrot parrot = new Parrot();
    parrot.setNeighbor(new Phone());
    parrot.sound();
    Assert.assertEquals(PHONE_RING + "\n", outContent.toString());
  }

}