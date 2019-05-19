package factorytest1;

public class GameAction implements Action{
  public void play(String name) {
    System.out.println(name + " 가 좋아하는 랜덤게임~~");
  }
}
