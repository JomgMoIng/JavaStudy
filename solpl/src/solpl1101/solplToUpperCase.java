package solpl1101;

import java.util.Scanner;

public class solplToUpperCase {
	public static void main(String[] args) {

		System.out.println("아스키코드");

		Scanner input = new Scanner(System.in);
		String str=input.nextLine();


		String result = str.substring(0,1).toUpperCase() + str.substring(1);
		
		String all = str.substring(1).toUpperCase();

		System.out.println(result);
	System.out.println(all);
	}
}
