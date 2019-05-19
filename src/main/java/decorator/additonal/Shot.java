package decorator.additonal;

import decorator.coffee.Beverage;

public class Shot extends Addbeverage{

  Beverage bever;
  
  public Shot(Beverage bever) {
    this.bever = bever;
  }
  
  @Override
  public String getbevername() {
    return "샤아앗추가";
  }

  @Override
  public int cost() {
    return 600+bever.cost();
  }
}
