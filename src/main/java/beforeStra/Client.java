package beforeStra;

public class Client {
	
	public static void main(String[] args) {
	
	Movable bus = new Bus();
	Movable subway = new Subway();
	
	bus.move();
	subway.move();
	}
}
