package factory1;

import java.util.ArrayList;
import java.util.List;

public class IDcardfactory extends Factory{

  List<String> owners = new ArrayList<String>();
  
  @Override
  protected Product createproduct(String owner) {
    return new IDcard(owner);
  }

  @Override
  protected void registproduct(Product product) {
    owners.add(((IDcard)product).getOwner());
  }
}
