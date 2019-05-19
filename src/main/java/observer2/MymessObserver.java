package observer2;

public class MymessObserver implements Observer{

  private String name;
  private Subject subject;

  public MymessObserver(String name) {
    this.name = name;
  }

  public void update() {
    String msg = (String)subject.getupdate(this);

    if (msg == null) {
      System.out.println(name + ":: No New Message");
    } else {
      System.out.println(name + ":: Consuming message::" + msg);
    }
  }

  public void setsubject(Subject sub) {
    this.subject = sub;
  }
}
