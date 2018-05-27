package org.kuldeep.modeling.animal;

import org.kuldeep.modeling.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import static org.kuldeep.modeling.utils.Constants.CAT_SOUND;

public class CatTest extends BaseTest {
  @Test
  public void shouldPrintCatSound() {
    Cat cat = new Cat();
    cat.sound();
    Assert.assertEquals(CAT_SOUND + "\n", outContent.toString());
  }

}