package strategy;

public class Main {
  public static void main(String[] agrs) {
    
    Player p1 = new Player("김아무개", new GameStrategy());
    Player p2 = new Player("이아무개", new ExerciseStrategy());
    
    p1.playstrategy();
    p2.playstrategy();
  }
}
