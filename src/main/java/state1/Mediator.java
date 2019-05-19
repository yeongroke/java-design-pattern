package state1;

public class Mediator {

  private State st;
  
  public Mediator() {
    this.st = new PowerOff();
  }
  
  public void setSt(State st) {
    this.st = st;
  }
  
  public void pushswitch() {
    st.powerstate();
  }
}
