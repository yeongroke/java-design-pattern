package classadapter;

public class Camable extends Camkind implements Contact{

  @Override
  public void camA() {
    camkA();
  }
  @Override
  public void camB() {
    camkB();
  }
}
