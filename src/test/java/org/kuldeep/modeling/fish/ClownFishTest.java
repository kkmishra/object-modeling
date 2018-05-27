package org.kuldeep.modeling.fish;

import org.kuldeep.modeling.BaseTest;
import org.kuldeep.modeling.interfaces.MakeJoke;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.kuldeep.modeling.utils.Constants.CLOWNFISH_TYPE;
import static org.kuldeep.modeling.utils.Constants.FISH_WALK;
import static org.kuldeep.modeling.utils.Constants.JOKE;

public class ClownFishTest extends BaseTest {
  @Test
  public void shouldPrintTheTypeOfClownFish() {
    ClownFish clownfish = new ClownFish();
    clownfish.type();
    assertEquals(CLOWNFISH_TYPE + "\n", outContent.toString());
  }

  @Test
  public void shouldTestThatClownFishCanMakeJoke() {
    assertTrue(MakeJoke.class.isAssignableFrom(ClownFish.class));
  }

  @Test
  public void shouldPrintJokeString() {
    ClownFish clownfish = new ClownFish();
    clownfish.makeJoke();
    assertEquals(JOKE + "\n", outContent.toString());
  }

  @Test
  public void shouldPrintCanNotWalkString() {
    ClownFish clownfish = new ClownFish();
    clownfish.walk();
    assertEquals(FISH_WALK + "\n", outContent.toString());
  }

}