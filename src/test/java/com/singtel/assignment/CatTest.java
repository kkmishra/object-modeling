package com.singtel.assignment;

import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.Constants.CAT_SOUND;
import static org.junit.Assert.*;

public class CatTest extends BaseTest {
  @Test
  public void shouldPrintCatSound() {
    Cat cat = new Cat();
    cat.sound();
    Assert.assertEquals(CAT_SOUND + "\n", outContent.toString());
  }

}