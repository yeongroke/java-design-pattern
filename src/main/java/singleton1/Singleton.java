package singleton1;

public class Singleton {
  private static Singleton signleton;

  private Singleton() {
    System.out.println("인스턴스 생성");
  }

  public static Singleton getInstance() {
    return signleton;
  }
}
