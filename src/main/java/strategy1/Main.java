package strategy1;

public class Main {

  public static void main(String[] args) {
    User u1 = new User(new KnifeStrategy());
    u1.foreat();

    //User u2 = new User(new ForkStrategy());
    u1 = new User(new ForkStrategy());
    u1.foreat();
  }
}
