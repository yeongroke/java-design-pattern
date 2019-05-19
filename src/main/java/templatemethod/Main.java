package templatemethod;

public class Main {
  public static void main(String[] args) {
    TemplateMethod tm1 = new StepTemplate('H');
    TemplateMethod tm2 = new StringTemplate("12345");
    
    tm1.step();
    tm2.step();
  }
}
