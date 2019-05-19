package strategy2;

public class WinStrategy implements Strategy{

  private int wincount;
  private int losecount;
  
  public void act(String name) {
    System.out.println(name + "응 너가이김 꺄르륵");
  }
}
