package exercise_80;

import java.util.Scanner;

public class ASCIIcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		byte Asciicode;
		System.out.println(" input an ASCII code: ");
		Asciicode = key.nextByte();
		System.out.println(" ASCII CODE " + Asciicode + " is " + (char) Asciicode);

	}

}