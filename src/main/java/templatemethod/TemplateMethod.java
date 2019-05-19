package templatemethod;

public abstract class TemplateMethod {

  public final void step() {
    open();
    doing();
    close();
  }
  
  protected abstract void open();
  protected abstract void doing();
  protected abstract void close();
  
}
