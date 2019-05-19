package bridge;

public class Abstractbridge {
  
  private Bridgeinter inte;
  
  public Abstractbridge(Bridgeinter inte) {
    this.inte = inte;
  }
  
  public void open() {
    inte.rawOpen();
  }
  public void close() {
    inte.rawClose();
  }
  public void print() {
    inte.rawPrint();
  }
  public final void display() {
    
  }
}
