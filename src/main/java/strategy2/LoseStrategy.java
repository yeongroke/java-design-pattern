package strategy2;

public class LoseStrategy implements Strategy{

  public void act(String name) {
    System.out.println(name + "응 너가 짐 깨르륵");
  }
}
