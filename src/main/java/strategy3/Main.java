package strategy3;

public class Main {
  public static void main(String[] agrs) {

    Player p1 = new Player(new GameStrategy());
    Player p2 = new Player(new ExerciseStrategy());

    p1.playstrategy("김아무개");
    p2.playstrategy("이아무개");
  }
}