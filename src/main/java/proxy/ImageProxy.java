package proxy;

public class ImageProxy {

  private String carname;
  
  public ImageProxy(String carname) {
    this.carname = carname;
    loadingImage();
  }
  
  public void loadingImage() {
    System.out.println(carname + " 로딩중");
  }
  
  public void diplayimage() {
    System.out.println("display " + carname);
  }
}
