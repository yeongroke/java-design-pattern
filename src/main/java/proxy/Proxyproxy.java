package proxy;

public class Proxyproxy implements Proxy{

  private ImageProxy imageproxy;
  private String filename;
  
  public Proxyproxy(String filename) {
    this.filename = filename;
  }
  
  @Override
  public void diplayimage() {
    if(imageproxy == null) {
      imageproxy = new ImageProxy(filename);
    }
    imageproxy.diplayimage();
  }
}
