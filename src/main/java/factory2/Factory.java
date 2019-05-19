package factory2;

public abstract class Factory {
  public final Product create(String type) {
    Product p = reserveproduct(type);
    buyproduct(p);
    
    return p;
  }
  protected abstract Product reserveproduct(String type);
  protected abstract void buyproduct(Product product);
}
