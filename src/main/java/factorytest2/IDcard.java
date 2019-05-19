package factorytest2;

public class IDcard extends Product {
  
  private String owner;
  
  public IDcard(String owner) {
    System.out.println(owner + " 카드를 만들어 볼까");
    this.owner = owner;
  }
  
  public void use() {
    System.out.println(owner + " 카드를 만들어부려따리");
  }
  
  public String getOwner() {
    return owner;
  }
}
