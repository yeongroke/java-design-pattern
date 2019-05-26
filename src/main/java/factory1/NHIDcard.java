package factory1;

public class NHIDcard extends Product {

  private String owner;
  
  public NHIDcard(String owner) {
    System.out.println(owner+" 농협 카드 만드는 중");
    this.owner = owner;
  }
  
  @Override
  public void use() {
    System.out.println(owner+" 카드 사용 중");
  }
  @Override
  public String getOwner() {
    return owner;
  }
}
