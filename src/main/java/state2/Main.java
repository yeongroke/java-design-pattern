package state2;

public class Main {
  public static void main(String[] args) throws InterruptedException {
      SafeFrame frame = new SafeFrame("State Sample");
      while(true) {
          for (int hour = 0; hour < 24; hour++) {
              frame.setColock(hour);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  System.out.println(e.getMessage());
              }
          }
      }
  }
}
