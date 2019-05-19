package prototype;

public class Messagebox implements Product{

  private char sr;

  public Messagebox(char sr) {
    this.sr = sr;
  }
  
  @Override
  public void use(String s) {
    int leng = s.length();
    
    for(int i=0; i<leng+4;i++) {
      System.out.print(sr);
    }
    System.out.println();
    System.out.println(sr+" "+s+" "+sr);
    for(int i=0;i<leng+4;i++) {
      System.out.print(sr);
    }
    System.out.println();
  }

  @Override
  public Product createclone() {
    System.out.println("1");
    Product p = null;        
    try {
      p = (Product)clone();
    }catch (Exception e) {
      e.printStackTrace();
    }
    return p;
  }
}
