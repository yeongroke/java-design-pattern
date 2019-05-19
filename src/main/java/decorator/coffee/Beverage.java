package decorator.coffee;

public abstract class Beverage {
  
  public String bevername = "없음";
  
  public String getbever() {
    return bevername;
  }
  public abstract int cost();
}
