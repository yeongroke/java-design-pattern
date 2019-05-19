package state2;

public interface Context {
  void setColock(int hour);               // 시간 설정
  void changeState(State state);          // 상태 전환 
  void callSecurityCenter(String msg);    // 경비센터 호출
  void recordLog(String msg);             // 경비센터 기록
}
