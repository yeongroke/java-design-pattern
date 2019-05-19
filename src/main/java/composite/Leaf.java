package composite;

public class Leaf extends Component{

  private String name;
  
  public Leaf(String name) {
    this.name = name;
  }
  
  public void show() {
    System.out.println(name);
  }
}
