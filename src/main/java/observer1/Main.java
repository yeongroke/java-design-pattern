package observer1;

public class Main {
  public static void main(String[] args) {
    Subject s1 = new Devicedata();
    
    Observer o1 = new SupObserver("김");
    Observer o2 = new SupObserver("이");
    Observer o3 = new SupObserver("무");
    
    s1.add(o1);
    s1.add(o2);
    s1.add(o3);
    
    o1.update(s1);
  }
}
