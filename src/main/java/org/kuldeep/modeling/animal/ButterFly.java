package org.kuldeep.modeling.animal;

import org.kuldeep.modeling.interfaces.Flying;

import static org.kuldeep.modeling.utils.Constants.FLY;

public class ButterFly extends Animal implements Flying {

  private Caterpillar caterpillar;

  public ButterFly(Caterpillar caterpillar) {
    this.caterpillar = caterpillar;
  }

  public void fly() {
    System.out.println(FLY);
  }

  public Caterpillar getCaterpillar() {
    return caterpillar;
  }

  @Override
  public boolean canFly() {
    return true;
  }

  @Override
  public boolean canMakeSound() {
    return false;
  }
}
