package converters;

import java.util.*;
import java.util.Scanner;

public class Currency_Converter {

	double inr, dollar, yen, euro;  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 
		while (true)	/*Creating While loop and Sets its True Initially so this program will
						run until we select 7 for exiting the program*/
			
		{ 
			
			System.out.println();
			System.out.println(" == Select Type Of Converter == ");
			System.out.println();
			System.out.println("1: Convert INR To Euro");
			System.out.println("2: Convert INR To Dollar");
			System.out.println("3: Convert INR To Yen");
			System.out.println("4: Convert Dollar To INR");
			System.out.println("5: Convert Yen To INR");
			System.out.println("6: Convert Euro To INR");
			System.out.println("7: For Exit");

			int type = sc.nextInt();  // Creating Scanner Object to store the user input value.

			if (type == 1)  
			{
				System.out.println(" ==  INR To Euro == ");
				System.out.println();
				System.out.println("Enter Amount Of INR : ");
				double inr = sc.nextDouble();
				double inrs = inr / 91.2d;
				System.out.println("Euro = " + inrs);

			} else if (type == 2) {
				System.out.println(" == INR To Dollar == ");
				System.out.println();
				System.out.println("Enter Amount Of INR : ");
				double inr = sc.nextDouble();
				System.out.printf("Dollar = " + inr / 83d);

			} else if (type == 3) {
				System.out.println(" == INR To Yen == ");
				System.out.println();
				System.out.println("Enter Amount Of INR : ");
				double inr = sc.nextDouble();
				System.out.printf("Yen =  %,.3f " + inr / 0.58d);

			} else if (type == 4) {
				System.out.println(" == Dollar To INR  == ");
				System.out.println();
				System.out.println("Enter Amount Of Dollar : ");
				double dollar = sc.nextDouble();
				System.out.printf("INR =  %,.3f " + dollar * 83d);

			} else if (type == 5) {
				System.out.println(" == Yen To INR  == ");
				System.out.println();
				System.out.println("Enter Amount Of Yen : ");
				double yen = sc.nextDouble();
				System.out.printf("INR =  %,.3f  " + yen * 0.58d);

			} else if (type == 6) {
				System.out.println(" == Euro To INR == ");
				System.out.println();
				System.out.println("Enter Amount Of Euros : ");
				double euros = sc.nextDouble();
				System.out.printf("INR =  %,.3f " + euros * 91.2d);

			} else if (type == 7) {
				System.out.println(" == Thanks For Visiting  == ");
				break;

			} else {
				System.out.println("Invalid Option Selection");
				
			}
		}

	}

}
