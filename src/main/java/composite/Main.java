package composite;

public class Main {
  public static void main(String[] args) {
    
    Leaf leaf1 = new Leaf("1");
    Leaf leaf2 = new Leaf("2");
    Leaf leaf3 = new Leaf("3");
    Leaf leaf4 = new Leaf("4");
    
    Composite c1 = new Composite();
    
    c1.add(leaf1);
    c1.add(leaf2);
    c1.add(leaf3);
    c1.add(leaf4);
    
    Composite c2 = new Composite();
    
    Leaf leaf5 = new Leaf("5");
    Leaf leaf6 = new Leaf("6");
    Leaf leaf7 = new Leaf("7");
    Leaf leaf8 = new Leaf("8");
    
    /*
     c2.add(leaf5); 
     c2.add(leaf6); 
     c2.add(leaf7); 
     c2.add(leaf8);
     */
    c2.add(leaf1);
    c2.add(leaf2);
    c2.add(leaf3);
    c2.add(leaf4);
    
    c1.add(c2);
    c1.show();
    
  }
}
