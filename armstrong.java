package assignment2;
import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter the number");
		int n=s.nextInt();
		int m=n;
		
		int sum=0,rem=0;
		
		
		while(n!=0) {
			
			rem=n%10;
			sum+=rem*rem*rem;
			n=n/10;
		}
		if(m==sum) System.out.println("Number is Armstrong");
		else System.out.println("Number is not Armstrong");
		
		
	}

}
