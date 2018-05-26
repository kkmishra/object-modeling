package com.singtel.assignment.animal;

import com.singtel.assignment.BaseTest;
import com.singtel.assignment.interfaces.Flying;
import org.junit.Test;

import static com.singtel.assignment.utils.Constants.CATERPILLAR_WALK;
import static com.singtel.assignment.utils.Constants.FLY;
import static com.singtel.assignment.utils.Constants.WALK;
import static org.junit.Assert.*;

public class CaterpillarTest extends BaseTest {
  @Test
  public void shouldTestThatCaterpillarCantFly() throws Exception {
    assertFalse(Flying.class.isAssignableFrom(Caterpillar.class));
  }

  @Test
  public void shouldPrintWalkForButterfly() throws Exception {
    Caterpillar caterpillar = new Caterpillar();
    caterpillar.walk();
    assertEquals(CATERPILLAR_WALK + "\n", outContent.toString());
  }

}