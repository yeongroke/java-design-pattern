package objectadapter;

public class Main {
  public static void main(String[] args) {
    Print p = new PrintAdapter("dd");
    
    p.printA();
    p.printB();
  }
}
