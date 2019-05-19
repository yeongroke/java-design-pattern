package state1;

public class Main {
  public static void main(String[] args) {
    
    Mediator md = new Mediator();
    
    md.setSt(new PowerOn());
    md.pushswitch();
    md.setSt(new Powerimdi());
    md.pushswitch();
    
  }
}