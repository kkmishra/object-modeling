package org.kuldeep.modeling.animal;

import org.kuldeep.modeling.BaseTest;
import org.kuldeep.modeling.interfaces.Flying;
import org.junit.Test;

import static org.kuldeep.modeling.utils.Constants.CATERPILLAR_WALK;
import static org.junit.Assert.*;

public class CaterpillarTest extends BaseTest {
  @Test
  public void shouldTestThatCaterpillarCantFly() {
    assertFalse(Flying.class.isAssignableFrom(Caterpillar.class));
  }

  @Test
  public void shouldPrintWalkForCaterpillar() {
    Caterpillar caterpillar = new Caterpillar();
    caterpillar.walk();
    assertEquals(CATERPILLAR_WALK + "\n", outContent.toString());
  }

  @Test
  public void shouldTestThatACaterpillarCanNotFly() {
    Caterpillar caterpillar = new Caterpillar();
    assertFalse(caterpillar.canFly());
  }


  @Test
  public void shouldReturnButterflyAfterMetamorphosis() {
    Caterpillar caterpillar = new Caterpillar();
    ButterFly butterFly = caterpillar.metamorphosis();
    assertNotNull(butterFly);
    assertTrue(Flying.class.isAssignableFrom(butterFly.getClass()));
    assertTrue(butterFly.getCaterpillar().equals(caterpillar));
  }
}