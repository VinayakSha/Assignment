package Assignments;

import java.util.Scanner;

public class SeriesCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,i;
System.out.println("Enter Number of term");
Scanner sc=new Scanner(System.in);
num= sc.nextInt();
sc.close();
for(i=1;i<=num;i++)
{
	System.out.print(i*i*i+ " ");
}

	}

}
