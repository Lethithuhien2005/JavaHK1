package exercise_80;
// nguoi dung nhap 1 neu tinh dien tich hcn
// nguoi dung nhap 2 neu tinh pt bac hai
// ko nhap 1 2 => du lieu ko hop le
import java.util.Scanner;
public class combination {
	public static int Area(int width, int length) {
		return (width*length);
	}
	public static void ptbac2(int a, int b, int c) {
		double delta = b*b-4*a*c;
		double x1, x2;
		if (a==0) {
			System.out.println(" pt co nghiem = " + (-c)/b);
		} else {
			if (delta < 0) {
				System.out.println(" pt vo nghiem ");
			} else if (delta==0) {
				System.out.println(" pt co nghiem kep =" + (-b)/(2*a));
			} else {
				x1=(-b + Math.sqrt(delta))/(2*a);
				x2 = (-b - Math.sqrt(delta))/(2*a);
				System.out.println(" pt co 2 nghiem " + " x1 = " + x1 + " x2 = " + x2);
			}
			
		}
	}
	public static void main(String[] args) {
		System.out.println(" nhap n =");
		Scanner key = new Scanner(System.in);
		int n = key.nextInt();
		if (n==1) {
			System.out.println(Area(2,3));
		} else if (n==2) {
			ptbac2(1, -5, 6);
		} else {
			System.out.println(" nhap du lieu ko hop le");
		}
	}
}
