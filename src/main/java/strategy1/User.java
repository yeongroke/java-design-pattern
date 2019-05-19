package strategy1;

public class User {
	
	private Strategy strategy;
	
	public User(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void foreat() {
		strategy.foreat();
	}
}
