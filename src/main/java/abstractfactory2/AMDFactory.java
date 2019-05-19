package abstractfactory2;

public class AMDFactory extends CPUfactory{

  public CPU producecpu() {
    return new AMDCPU();
  }
}
