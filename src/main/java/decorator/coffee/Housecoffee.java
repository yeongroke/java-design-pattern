package decorator.coffee;

public class Housecoffee extends Beverage{

  public Housecoffee() {
    bevername = "하우스커피";
  }
  
  @Override
  public int cost() {
    return 2200;
  }
}
