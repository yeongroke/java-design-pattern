package decorator.coffee;

public class Espresso extends Beverage{

  public Espresso() {
    bevername = "에스프레소";
  }
  @Override
  public int cost() {
    return 2000;
  }
}
