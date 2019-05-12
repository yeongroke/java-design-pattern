package sigleton;

public class Singleton {

  private static Singleton singleton = new Singleton();

  public static Singleton getSingleton() {
    return singleton;
  }
  
  
}
