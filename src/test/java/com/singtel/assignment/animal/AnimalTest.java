package com.singtel.assignment.animal;

import com.singtel.assignment.BaseTest;
import com.singtel.assignment.animal.Animal;
import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.utils.Constants.WALK;

public class AnimalTest extends BaseTest {

  @Test
  public void shouldPrintWalkString() throws Exception {
    Animal animal = new Animal();
    animal.walk();
    Assert.assertEquals(WALK + "\n", outContent.toString());
  }

}