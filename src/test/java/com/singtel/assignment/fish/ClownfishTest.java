package com.singtel.assignment.fish;

import com.singtel.assignment.BaseTest;
import com.singtel.assignment.interfaces.Cannibal;
import com.singtel.assignment.interfaces.MakeJoke;
import org.junit.Test;

import static com.singtel.assignment.utils.Constants.CLOWNFISH_TYPE;
import static com.singtel.assignment.utils.Constants.SHARK_TYPE;
import static org.junit.Assert.*;

public class ClownfishTest extends BaseTest {
  @Test
  public void shouldPrintTheTypeOfClownFish() throws Exception {
    Clownfish clownfish = new Clownfish();
    clownfish.type();
    assertEquals(CLOWNFISH_TYPE + "\n", outContent.toString());
  }

 @Test
  public void shouldTestThatClownFishCanMakeJoke() throws Exception {
   assertTrue(MakeJoke.class.isAssignableFrom(Clownfish.class));
  }

}