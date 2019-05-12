package factorytest1;

public class User {
  
  private String name;
  private Action action;
  
  public User(String name , Action action) {
    this.name = name;
    this.action = action;
  }
  
  public void getAction() {
    action.play(this.name);
  }
}
