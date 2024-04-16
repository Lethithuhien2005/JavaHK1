package exercise_80;

// in ra day so 1 3 7 15 31 63 127 255 511 1023
public class print13715 {
	public static void dayso(int n) {
		int sum=1;
		System.out.println(sum);
		for ( int i=2; i<=n; i=i*2){
			sum=sum+i;
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		dayso(1020);
	}
}
