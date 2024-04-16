package exercise_80;

import java.util.Scanner;

public class cos_sin_ceil___ {
	public static void main(String[] agrs) {
		Scanner key = new Scanner(System.in);
		System.out.println("input n = ");
		double n = key.nextDouble();
		double goc = Math.toRadians(n);
		double sin = Math.sin(goc); // doi do sang radian
		System.out.println(" sin " + n + "=" + sin);
		double cos = Math.cos(goc);
		System.out.println(" cos " + n + "=" + cos);
		double sqrt = Math.sqrt(n);
		System.out.println(" nhap a = ");
		double a = key.nextDouble();
		double ceil = Math.ceil(a);
		System.out.println(" ceil= " + ceil);
		double floor = Math.floor(a);
		System.out.println(" foor= " + floor);
		double round = Math.round(a * 100.0) / 100.0;
		System.out.println(" round = " + round);
	}
}
