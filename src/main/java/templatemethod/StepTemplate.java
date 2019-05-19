package templatemethod;

public class StepTemplate extends TemplateMethod{

  private char ch;
  
  public StepTemplate(char ch) {
    this.ch = ch;
  }
  
  @Override
  protected void open() {
    System.out.println("열림");
  }
  @Override
  protected void doing() {
    System.out.println(ch);
  }
  @Override
  protected void close() {
    System.out.println("닫힘");
  }
}
