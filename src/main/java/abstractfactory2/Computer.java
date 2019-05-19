package abstractfactory2;

public class Computer {

  private CPU cpu;
  
  public Computer(CPUfactory cpufactory) {
    cpu = cpufactory.producecpu();
    cpu.process();
  }
}
