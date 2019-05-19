package observer2;

public interface Subject {
  void registobs(Observer o);
  void removeobs(Observer o);
  void nitifyobs();
  Object getupdate(Observer o);
}
