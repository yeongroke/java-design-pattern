package factory2;

import java.util.ArrayList;
import java.util.List;

public class GoodsFactory extends Factory{
  
  private List<String> types = new ArrayList<String>();
  
  @Override
  protected Product reserveproduct(String type) {
    return new Goods(type); 
  }
  @Override
  protected void buyproduct(Product product) {
    types.add(((Goods)product).getType());
  }
}
