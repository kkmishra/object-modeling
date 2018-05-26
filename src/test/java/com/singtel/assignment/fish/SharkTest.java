package com.singtel.assignment.fish;

import com.singtel.assignment.BaseTest;
import com.singtel.assignment.interfaces.Cannibal;
import org.junit.Test;

import static com.singtel.assignment.utils.Constants.SHARK_TYPE;
import static org.junit.Assert.*;

public class SharkTest extends BaseTest {
  @Test
  public void shouldPrintTheTypeOfShark() throws Exception {
    Shark shark = new Shark();
    shark.type();
    assertEquals(SHARK_TYPE + "\n", outContent.toString());
  }

  @Test
  public void shouldTestThatSharkIsCannibal() throws Exception {
    assertTrue(Cannibal.class.isAssignableFrom(Shark.class));
  }
}