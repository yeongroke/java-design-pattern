package objectadapter;

public class PrintAdapter extends Print{

  private String input;
  private InputPrint inputprint;
  public PrintAdapter(String input) {
    this.inputprint = new InputPrint();
  }
  
  @Override
  public void printA() {
    inputprint.printiA(input);
  }

  @Override
  public void printB() {
    inputprint.printiB(input);
  }
}
