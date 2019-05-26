package factory1;

public class KBIDcard extends Product {

  private String owner;
  
  public KBIDcard(String owner) {
    System.out.println(owner+" 국민 카드 만드는 중");
    this.owner = owner;
  }
  
  @Override
  public void use() {
    System.out.println(owner+" 국민 카드 사용 중");
  }
  @Override
  public String getOwner() {
    return owner;
  }
}
