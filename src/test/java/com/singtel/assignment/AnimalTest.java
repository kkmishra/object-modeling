package com.singtel.assignment;

import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.Constants.WALK;

public class AnimalTest extends BaseTest {

  @Test
  public void shouldPrintWalkString() throws Exception {
    Animal animal = new Animal();
    animal.walk();
    Assert.assertEquals(WALK + "\n", outContent.toString());
  }

}