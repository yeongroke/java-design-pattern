package strategy2;

public class User {

  private String name;
  private Strategy strategy;
  
  public User(String name , Strategy strategy) {
    this.name = name;
    this.strategy = strategy;
  }
  
  public void act() {
    strategy.act(name);
  }
}
