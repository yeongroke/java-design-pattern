package factorytest2;

import java.util.ArrayList;
import java.util.List;

public class IDcardFactory extends Factory{
  
  private List<String> owners = new ArrayList<>();
  
  @Override
  protected Product createProduct(String owner) {
    return new IDcard(owner);
  }
  
  @Override
  protected void registerProduct(Product product) {
    owners.add(((IDcard)product).getOwner());
  }
}
