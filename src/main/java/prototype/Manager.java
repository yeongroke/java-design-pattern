package prototype;

import java.util.HashMap;

public class Manager {

  private HashMap<String, Product> promap = new HashMap<>();
  
  public void register(String name , Product proto) {
    promap.put(name, proto);
  }
  
  public Product create(String protoname) {
    Product p = (Product)promap.get(protoname);
    
    return p;
  }
}
