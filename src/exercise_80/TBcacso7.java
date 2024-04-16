package exercise_80;

public class TBcacso7 {
 public static int chia7( int x, int y) {
	 int sum = 0;
	 for (int i=x; i<=y;i++) {
		 if (i%7==0) {
			 sum = sum + i;
		 }
	 }
	 return sum;
 }
 public static void main(String[] args) {
	System.out.println(chia7(1,1000));
}
	 
 }
