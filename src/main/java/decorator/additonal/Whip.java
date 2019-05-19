package decorator.additonal;

import decorator.coffee.Beverage;

public class Whip extends Addbeverage{

  Beverage bever;
  
  public Whip(Beverage bever) {
    this.bever = bever;
  }
  
  public String getbevername() {
    return "휘이핑";
  }

  @Override
  public int cost() {
    return 500+bever.cost();
  }
}
