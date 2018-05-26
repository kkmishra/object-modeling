package com.singtel.assignment.animal;

import com.singtel.assignment.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static com.singtel.assignment.utils.Constants.CAT_SOUND;

public class CatTest extends BaseTest {
  @Test
  public void shouldPrintCatSound() {
    Cat cat = new Cat();
    cat.sound();
    Assert.assertEquals(CAT_SOUND + "\n", outContent.toString());
  }

}