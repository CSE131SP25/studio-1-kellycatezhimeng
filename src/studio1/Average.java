package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		double n1 = in.nextInt();
		
		double n2 = in.nextInt();
		
		double average = (n1 + n2) / 2;
		System.out.println("The average is: " + average);
		
	}

}
