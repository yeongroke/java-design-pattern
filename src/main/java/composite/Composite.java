package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
  
  private List<Component> comlist = new ArrayList<>();
  
  public void add(Component c) {
    comlist.add(c);
  }
  
  public void remove(Component c) {
    comlist.remove(c);
  }
  
  @Override
  public void show() {
    for(Component cli : comlist) {
      cli.show();
    }
  }
}