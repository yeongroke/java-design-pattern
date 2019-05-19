package abstractfactory1.Factory;

public class Tour {
  
  private TourStatus Tourstatus;
  
  public Tour() {
    Tourstatus = TourStatus.CLOSED;
  }
  public TourStatus tourstatus() {
    return Tourstatus;
  }
  
}
