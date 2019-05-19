package factory2;

public class Goods extends Product{
  private String type;
  
  public Goods(String type) {
    System.out.println(type + " 상품이넹");
    this.type = type;
  }
  public void use() {
    System.out.println(type + " 쓰고잇네?");
  }
  public String getType() {
    return type;
  }
}
