package strategy3;

public class Player {
  private Strategy strategy;
  
  public Player(Strategy strategy) {
    this.strategy = strategy;
  }
  public void playstrategy(String name) {
    strategy.play(name);;
  }
}
