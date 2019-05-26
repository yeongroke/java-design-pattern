package factory1;

public class Main {

  public static void main(String[] args) {
    Factory f = new IDcardfactory();
    
    Product p1 = f.create("NH");
    Product p2 = f.create("KB");
    
    p1.use();
    p2.use();
  }
}
