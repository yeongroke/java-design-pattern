package command;

public class Main {
  public static void main(String[] args) {
    Computer computer = new Computer();
    
    Command order1 =  new ShutdownCommand(computer);
    Command order2 =  new RestartCommand(computer);
    
    Ordercommand o = new Ordercommand();
    
    String s = "restart";
    
    if(s.equals("shutdown")) {
      o.setexecute(order1);
    }else {
      o.setexecute(order2);
    }
  }
}
