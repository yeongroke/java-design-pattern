package abstractfactory2;

public class Main {
  public static void main(String[] args) {
   new Computer(new IntelFactory());
   new Computer(new AMDFactory());
  }
}
