package command;

public class RestartCommand implements Command{

  private Computer computer;
  
  public RestartCommand(Computer computer) {
    this.computer = computer;
  }
  
  public void execute() {
    System.out.println("RestartCommand - execute");
    computer.restart();
  }
}
