package exercise_80;

public class printHCN {
	public static void rectangle(int x, int y) {
		for (int i = x; i <= y; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		rectangle(1, 5);
	}

}
