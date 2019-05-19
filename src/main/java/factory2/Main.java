package factory2;

public class Main {
  public static void main(String[] args) {
    
    Factory f = new GoodsFactory();
    
    Product p1 = f.create("p1");
    Product p2 = f.create("p2");
    Product p3 = f.create("p3");
    
    p1.use();
    p2.use();
    p3.use();
  }
}
