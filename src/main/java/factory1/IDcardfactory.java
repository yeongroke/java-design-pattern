package factory1;

import java.util.ArrayList;
import java.util.List;

public class IDcardfactory extends Factory{

  List<String> owners = new ArrayList<String>();
  private Product produc;
  
  @Override
  protected Product createproduct(String owner) {
    switch (owner) {
      case "NH":
          produc = new NHIDcard(owner);
        break;
      case "KB":
          produc = new KBIDcard(owner);
      default:
        break;
    }
    return produc;
  }

  @Override
  protected void registproduct(Product product) {
    System.out.println(product.getOwner()+" 카드 등록 완료");
    owners.add(product.getOwner());
  }
}
