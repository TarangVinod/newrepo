package assignment2;

public class pattern7_4 {
	
	public static void main(String[] args)
	{
	int i,j,k;
	for(i=1; i<=9; i++)
	{
	for(j=i; j<9; j++)
	{
	System.out.print(" ");
	}
	for(k=1; k<=i; k++)
	{
	System.out.print("*");
	}
	System.out.println();
	i=i+1;
	}
	}
}