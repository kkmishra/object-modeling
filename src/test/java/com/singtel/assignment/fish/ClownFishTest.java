package com.singtel.assignment.fish;

import com.singtel.assignment.BaseTest;
import com.singtel.assignment.interfaces.MakeJoke;
import org.junit.Test;

import static com.singtel.assignment.utils.Constants.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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