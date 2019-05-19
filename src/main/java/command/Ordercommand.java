package command;

public class Ordercommand {

  //private List<Command> comlist = new ArrayList<Command>();
  
  public void setexecute(Command c) {
    System.out.println("setexecute");
    //comlist.add(c);
    c.execute();
  }
}
