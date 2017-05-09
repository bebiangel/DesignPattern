package singleton;

public class Main {
	//
	public static void main(String[] args) {
		//
		System.out.println("Start");
		Singleton obj1 = Singleton.newInstance();
		Singleton obj2 = Singleton.newInstance();
		if (obj1 == obj2) {
			System.out.println("obj1 == obj2");
		} else {
			System.out.println("obj1 != obj2");
		}
		System.out.println("End");
	}
}
