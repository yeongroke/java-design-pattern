package prototype;

public class Main {
  public static void main(String[] args) {
    Manager manager = new Manager();
    Underline upen = new Underline('~');
    Messagebox mbox = new Messagebox('*');
    Messagebox sbox = new Messagebox('/');
    manager.register("strong message", upen);
    manager.register("warning box", mbox);
    manager.register("slash box", sbox);
    
    // 생성
    Product p1 = manager.create("strong message");
    p1.use("Hello, world.");
    Product p2 = manager.create("warning box");
    p2.use("Hello, world.");
    Product p3 = manager.create("slash box");
    p3.use("Hello, world.");
  }
}
