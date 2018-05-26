package com.singtel.assignment;

import com.singtel.assignment.Chicken.Type;
import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.Chicken.Type.ROOSTER;
import static com.singtel.assignment.Constants.CAT_SOUND;
import static com.singtel.assignment.Constants.DOG_SOUND;
import static com.singtel.assignment.Constants.ROOSTER_SOUND;
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

}