package builder;

import builder.Builderex.Builder;

public class Main {
  public static void main(String[] args) {
    Builder builder = new Builder(2, 2);
    
    System.out.println(builder.calories(1).fat(4).carbohydrate(3).sodium(1));
  }
}