package exercise_80;



public class EVEN {
	public static void excercise11(int x, int y) {
		for (int i=x; i<=y; i++) {
			System.out.println(i);
			if (i%2==0) {
				System.out.println("EVEN");
			} else {
				System.out.println("NOT EVEN");
			}
		}
	}
	public static void main(String[] args) {
		excercise11(1,100);
	}
}

