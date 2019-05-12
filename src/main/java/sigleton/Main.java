package sigleton;

public class Main {

  public static void main(String[] args) {
    
    Singleton si1 = Singleton.getSingleton();
    Singleton si2 = Singleton.getSingleton();
    
    if(si1 == si2 ) {
      System.out.println("응 같아");
    }else {
      System.out.println("다름");
    }
    
  }
}
