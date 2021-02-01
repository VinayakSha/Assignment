package Assignments;

import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		sc.close();
		//Palindrome No is a No that remains same when digits are reversed
	int org_num=num;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}
		
			if(org_num==rev)
			{
				
			System.out.println(org_num+" is a Palindrome Number");
			}
			
			else
			{
				System.out.println(org_num+" is not a Palindrome Number");
				
		}
		 
		

	}
  
}
