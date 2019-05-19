package observer2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mymess implements Subject{

  private List<Observer> ob = new ArrayList<Observer>();
  private String msg;
  @Override
  public void registobs(Observer o) {
    if(!ob.contains(o)) {
      ob.add(o);
    }
  }

  @Override
  public void removeobs(Observer o) {
    ob.remove(o);
  }

  @Override
  public void nitifyobs() {
    Iterator<Observer> iob = ob.iterator();
    while(iob.hasNext()) {
      Observer o = iob.next();
      o.update();
    }
  }

  public Object getupdate(Observer obj) {
    return this.msg;
  }

  public void postMessage(String msg) {
    System.out.println("Message Posted to Topic : " + msg);
    this.msg = msg;
    nitifyobs();
  }
}
