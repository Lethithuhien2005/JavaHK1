package exercise_80;

import java.util.Scanner;

public class codeASCII {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println(" nhap ki tu : ");
		char kitu = key.next().charAt(0);
		System.out.println(" ASCII code of " + kitu + " is " + (byte)kitu);
	}

}
