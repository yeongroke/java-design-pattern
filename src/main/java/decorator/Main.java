package decorator;

import decorator.additonal.Shot;
import decorator.additonal.Whip;
import decorator.coffee.Beverage;
import decorator.coffee.Espresso;

public class Main {
  public static void main(String[] args) {
    
    Beverage bever = new Espresso();
    
    bever = new Whip(bever);
    bever = new Shot(bever);
    
    System.out.println(bever.bevername+","+bever.cost());
  }
}
