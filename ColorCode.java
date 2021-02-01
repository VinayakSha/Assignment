package Assignments;

import java.util.Scanner;

public class ColorCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int color;
		
		System.out.println("Enter the Color Code");
		Scanner sc= new Scanner(System.in);
		color=sc.nextInt();
		sc.close();
		
		switch(color) {
			case 1:
		System.out.println("Red");
		break;
		case 2:
			System.out.println("Blue");
		break;
		case 3:
			System.out.println("Green");
			break;
		case 4:
			System.out.println("Orange");
			break;
			case 5:
				System.out.println("Yellow");
				break;
			case 6:
				System.out.println("White");
				break; 
				default:
					System.out.println("Invalid Code");
				
		}
	}
}
