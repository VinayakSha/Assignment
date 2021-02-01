package Assignments;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0, rem=0, sum=0;		
		System.out.println("Please Enter a Number");
Scanner sc =new Scanner(System.in);
num =sc.nextInt();
sc.close();
while(num>0)
{
	rem=num%10;
	sum=sum+rem;
	num=num/10;
}
System.out.println("Sum of Digit is "+ sum);

}


	}

