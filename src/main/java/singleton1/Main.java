package singleton1;

public class Main {
	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 인스터스이다.");
		}else {
			System.out.println("다른 인스턴스이다.");
		}
		System.out.println("끝");
	}
}
