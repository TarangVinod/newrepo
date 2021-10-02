package assignment2;

import java.util.*;
public class dowhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Enter first number: ");
			int num1 = sc.nextInt();
			System.out.println("Enter second number: ");
			int num2 = sc.nextInt();
			System.out.println();
			int sum = num1 + num2;
			System.out.println("sum is: " +sum);
			
			System.out.println("Do you wish to perform the operation again: ");
			ch = sc.next().charAt(0);
			System.out.println();
			
		}while (ch=='y'||ch=='Y');
		
sc.close();
	}
}
