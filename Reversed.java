package Assignments;

import java.util.Scanner;

public class Reversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
System.out.println("Enter a number");
Scanner sc =new Scanner(System.in);
num=sc.nextInt();
sc.close();
int rev=0;

while(num>0)
{
	rev=rev*10 + num%10;
	num=num/10;
}
System.out.println("Reversed number is "+rev);
	}
	

	
}

	
