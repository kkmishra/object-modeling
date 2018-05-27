package org.kuldeep.modeling.fish;

import org.kuldeep.modeling.BaseTest;
import org.kuldeep.modeling.interfaces.Cannibal;
import org.junit.Test;

import static org.kuldeep.modeling.utils.Constants.FISH_WALK;
import static org.kuldeep.modeling.utils.Constants.SHARK_TYPE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SharkTest extends BaseTest {
  @Test
  public void shouldPrintTheTypeOfShark() {
    Shark shark = new Shark();
    shark.type();
    assertEquals(SHARK_TYPE + "\n", outContent.toString());
  }

  @Test
  public void shouldTestThatSharkIsCannibal() {
    assertTrue(Cannibal.class.isAssignableFrom(Shark.class));
  }


  @Test
  public void shouldPrintCanNotWalkString() {
    Shark shark = new Shark();
    shark.walk();
    assertEquals(FISH_WALK + "\n", outContent.toString());
  }
}