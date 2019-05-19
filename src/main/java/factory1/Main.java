package factory1;

public class Main {

  public static void main(String[] args) {
    Factory f = new IDcardfactory();
    
    Product p1 = f.create("d1");
    Product p2 = f.create("d2");
    Product p3 = f.create("d3");
    
    p1.use();
    p2.use();
    p3.use();
  }
}
