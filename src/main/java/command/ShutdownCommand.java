package command;

public class ShutdownCommand implements Command{

  private Computer computer;
  
  public ShutdownCommand(Computer computer) {
    this.computer = computer;
  }
  public void execute() {
    computer.shutdown();
  }
}
