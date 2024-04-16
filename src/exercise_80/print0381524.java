package exercise_80;
//in ra 10 so trong day 0 3 8 15 24 35 48 63 80 99
public class print0381524 {
	public static void dayso(int n) {
		int sum =0;
		System.out.println(sum);
		for (int i=3; i<=n ; i=i+2) {
			sum = sum +i;
		System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		dayso(19);
	}
}