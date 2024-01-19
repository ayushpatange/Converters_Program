package converters;

import java.util.Scanner;

public class Time_Converter {

	// Variables For Time converter.
	
	int hours;
	int minutes;
	int seconds;
	
	// 1. Method to calculate Minutes using Hours

		public float calculateMFromH(float m1) {
			float h1 = m1 * 60;
			return h1;
		}
		
	// 2. Method to calculate Seconds using hours

		public float calculateSFromH(float hours) {
			float h1 = hours * 3600;
			return h1;
		}

	// 3. Method to calculate hour using minutes
	public float calculateHFromM(float minutes) {
		float h1 = minutes / 60;
		return h1;
	}

	//4. Method to calculate Seconds using Minutes

		public float calculateSFromM(float minutes) {
			float h1 = minutes * 60;
			return h1;
		}
	
	// 5. Method to calculate hours using seconds

	public float calculateHFromS(float seconds) {
		float h1 = seconds / 3600;
		return h1;
	}
	
	// 6. Method to calculate Minutes from seconds
	public float calculateMFromS(float seconds) {
		float h1 = seconds/60;
		return h1;
	}


	public static void main(String[] args) {

		Time_Converter tc= new Time_Converter();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("=== Welcome To Time Coverter ===");
			System.out.println();
			System.out.println("1. Hours To Minutes ");
			System.out.println("2. Hours To Seconds ");
			System.out.println("3. Minutes To Hours ");
			System.out.println("4. Minutes To Seconds ");
			System.out.println("5. Seconds To Hours");
			System.out.println("6. Seconds To Minutes ");
			System.out.println("7. For Exit ");
			
			int type = sc.nextInt();
			
			if(type == 1)    //  Hours To Minutes Conversion.
			{
				System.out.println(" == Hours To Minutes Conversion == ");
				System.out.println("Enter Hours  : ");
				float m1 = sc.nextFloat();
				float dc1 = tc.calculateMFromH(m1);
				System.out.println(m1 + " Hours Is Equals To = " + dc1 + " Minutes");
				System.out.println();
			}
			else if( type == 2)   //Hours To Seconds Conversion.
			{
				System.out.println(" == Hours To Seconds Conversion == ");
				System.out.println("Enter Hours  : ");
				float m1 = sc.nextFloat();
				float dc1 = tc.calculateSFromH(m1);
				System.out.println(m1 + " Hours Is Equals To = " + dc1 + " Seconds");
				System.out.println();
			}
			else if( type == 3)   //  Minutes To Hours Conversion.
			{
				System.out.println(" == Minutes To Hours Conversion == ");
				System.out.println("Enter Minutes  : ");
				float m1 = sc.nextFloat();
				float dc1 = tc.calculateHFromM(m1);
				System.out.println(m1 + " Minutes Is Equals To = " + dc1 + " Hours");
				System.out.println();
			}
			else if( type == 4) // Minutes To Seconds Conversion .
			{
				System.out.println(" == Minutes To Seconds Conversion == ");
				System.out.println("Enter Minutes  : ");
				float m1 = sc.nextFloat();
				float dc1 = tc. calculateSFromM(m1);
				System.out.println(m1 + " Minutes Is Equals To = " + dc1 + " Seconds");
				System.out.println();
			}
			else if( type == 5)   // Seconds To Hours Conversion.
			{
				System.out.println(" == Seconds To Hours Conversion == ");
				System.out.println("Enter Seconds  : ");
				float m1 = sc.nextFloat();
				float dc1 = tc. calculateHFromS(m1);
				System.out.println(m1 + " Seconds Is Equals To = " + dc1 + " Hours");
				System.out.println();
			}
			else if( type == 6)  // Seconds To Minutes Conversion.
			{
				System.out.println(" == Seconds To Minutes Conversion == ");
				System.out.println("Enter Seconds  : ");
				float m1 = sc.nextFloat();
				float dc1 = tc. calculateMFromS(m1);
				System.out.println(m1 + " Seconds Is Equals To = " + dc1 + " Minutes");
				System.out.println();
			}
			else if( type == 7) {
				System.out.println(" == Thanks For Visiting == ");
				break;
			}
			else {
				System.out.println("Invalid Number Choosen");
				System.out.println();
				
			}
	}
	}
}

