package factorytest1;

public abstract class Factory {
  public Action caseplay(String name) {
    
    switch(name) {
      case "축구":
        return new SoccerAction();
      case "게임":
        return new GameAction();
      default :
        System.out.println("틀림");
        break;
    }
    return null;
  };
}
