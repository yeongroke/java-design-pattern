package observer1;

public class SupObserver implements Observer{

  private String name;
  
  public SupObserver(String name) {
    System.out.println(name + " 임");
    this.name = name;
  }
  
  public void update(Subject s) {
    System.out.println(name+"의"+s+"임");
  }
}
