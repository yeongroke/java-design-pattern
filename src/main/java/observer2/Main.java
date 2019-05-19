package observer2;

public class Main {
  public static void main(String[] args) {
    Mymess m1 = new Mymess();
    
    Observer o1 = new MymessObserver("o1");
    Observer o2 = new MymessObserver("o2");
    Observer o3 = new MymessObserver("o3");
    
    m1.registobs(o1);
    m1.registobs(o2);
    m1.registobs(o3);
    
    o1.setsubject(m1);
    o2.setsubject(m1);
    o3.setsubject(m1);
    
    m1.postMessage("test1");
    o1.update();
    o2.update();
    o3.update();
    m1.postMessage("test2");
  }
}
