package observer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fooddata implements Subject{

  private List<Observer> ob = new ArrayList<Observer>();
  
  @Override
  public void add(Observer o) {
    ob.add(o);
  }

  @Override
  public void remove(Observer o) {
    ob.remove(o);
  }

  @Override
  public void notify(Observer o) {
    Iterator<Observer> iob = ob.iterator();
    
    while(iob.hasNext()) {
      o = iob.next();
      o.update(this);
    }
  }
}
