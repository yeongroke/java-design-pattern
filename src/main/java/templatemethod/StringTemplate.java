package templatemethod;

public class StringTemplate extends TemplateMethod{

  private String string;
  private int width;
  
  public StringTemplate(String string) {
    this.string = string;
    this.width = string.length();
  }
  
  @Override
  protected void open() {
    System.out.println("시작");
  }

  @Override
  protected void doing() {
    System.out.println(string);
  }

  @Override
  protected void close() {
    System.out.println("끝");
  }

}
