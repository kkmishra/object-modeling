package com.singtel.assignment.fish;

import com.singtel.assignment.BaseTest;
import com.singtel.assignment.interfaces.MakeJoke;
import org.junit.Test;

import static com.singtel.assignment.utils.Constants.CLOWNFISH_TYPE;
import static com.singtel.assignment.utils.Constants.JOKE;
import static org.junit.Assert.*;

public class ClownFishTest extends BaseTest {
  @Test
  public void shouldPrintTheTypeOfClownFish() throws Exception {
    ClownFish clownfish = new ClownFish();
    clownfish.type();
    assertEquals(CLOWNFISH_TYPE + "\n", outContent.toString());
  }

  @Test
  public void shouldTestThatClownFishCanMakeJoke() throws Exception {
    assertTrue(MakeJoke.class.isAssignableFrom(ClownFish.class));
  }

  @Test
  public void shouldPrintJokeString() throws Exception {
    ClownFish clownfish = new ClownFish();
    clownfish.makeJoke();
    assertEquals(JOKE + "\n", outContent.toString());
  }

}