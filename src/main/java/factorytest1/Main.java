package factorytest1;

public class Main {
  public static void main(String[] args) {
    Factory f1 = new Factory() {};
    
    Action a1 = f1.caseplay("축구");
    a1.play("김아무개");
    Action a2 = f1.caseplay("게임");
    a2.play("이아무개");
  }
}
