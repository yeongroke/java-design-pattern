package abstractfactory2;

public class IntelFactory extends CPUfactory{

  public CPU producecpu() {
    return new IntelCPU();
  }
}
