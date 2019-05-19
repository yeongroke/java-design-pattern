package factory1;

public abstract class Factory {

  public final Product create(String owner) {
    Product p = createproduct(owner);
    registproduct(p);
    
    return p;
  }
  protected abstract Product createproduct(String owner);
  protected abstract void registproduct(Product product);
}
