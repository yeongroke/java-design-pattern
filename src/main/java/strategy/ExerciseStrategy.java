package strategy;

public class ExerciseStrategy implements Strategy{
  public void play(String name) {
    System.out.println(name + " 운동은 exercise임 알았음?");
  }
}
