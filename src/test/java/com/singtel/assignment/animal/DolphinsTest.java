package com.singtel.assignment.animal;

import com.singtel.assignment.BaseTest;
import org.junit.Test;

import static com.singtel.assignment.utils.Constants.SWIM;
import static org.junit.Assert.*;

public class DolphinsTest extends BaseTest {
  @Test
  public void shouldPrintDolphinSound() {
    Dolphins dolphins = new Dolphins();
    dolphins.swim();
    assertEquals(SWIM + "\n", outContent.toString());
  }

}