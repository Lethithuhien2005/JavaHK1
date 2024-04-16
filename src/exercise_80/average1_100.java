package exercise_80;

public class average1_100 {
	public static double average(int x, int y ) {
		double sum = 0;
		double average;
		for (double i=1; i<=100;i++) {
			sum = sum + i;		
			}
		average = sum/100;
		return average;
	}
	public static void main(String[] args) {
		System.out.println(average(1,100));
	}
}
