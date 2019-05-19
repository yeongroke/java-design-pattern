package bridge;

public class Stringbridge extends Bridgeinter{

  private String st;
  private int hei;
  
  public Stringbridge(String st) {
    this.st = st;
    this.hei = st.length();
  }
  
  @Override
  public void rawOpen() {
    printline();
  }

  @Override
  public void rawPrint() {
    System.out.println("|"+st+"|+");
  }

  @Override
  public void rawClose() {
    printline();
  }
  
  private void printline() {
    System.out.print("+");
    for (int i = 0; i < hei; i++) {
        System.out.print("-");
    }
    System.out.println("+");
  }
}
