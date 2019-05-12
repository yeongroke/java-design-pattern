package strategy;

public class Player {
  private String name;
  private Strategy strategy;
  
  public Player(String name , Strategy strategy) {
    this.name = name;
    this.strategy = strategy;
  }
  
  public void playstrategy() {
    strategy.play(this.name);;
  }
}
