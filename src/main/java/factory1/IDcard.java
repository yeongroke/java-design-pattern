package factory1;

public class IDcard extends Product {

  private String owner;
  
  public IDcard(String owner) {
    
    System.out.println(owner+"ㅇㅇ 카드만드는중");
    this.owner = owner;
  }
  
  public void use() {
    System.out.println(owner+"카드 사용중");
  }
  
  public String getOwner() {
    return owner;
  }
}
