package exercise_80;

import java.util.Scanner;

public class num_chara_string {
	public static void main(String[] args) {
		Scanner key =new Scanner(System.in);
		int count =0;
		System.out.println(" nhap 1 chuoi bat ki: ");
		String str=key.nextLine();
		for (int i=0; i<=str.length()- 1; i++) {
			if ((str.charAt(i)=' ') && (str.charAt(i+1) != ' '))  {
				count=count+1;
			}
		}
	    if (str.charAt(0) != 0) {
				count=count+1;
			}
	    System.out.println(" co so ki tu la" + count);
		
	}

}
