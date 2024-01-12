package converters;

import java.util.*;

public class Distance_Converter {

	double km, m, miles;

	// 1 : Methods To calculate Kilometer from Miles

	public double calculateKMformMiles(double miles) {
		double answer = miles * 0.6213711922;
		return answer;
	}
	// 2: Methods To calculate Kilometer from Miles

	public double calculateMformMiles(double miles) {
		double answer = miles * 1609.344;
		return answer;
	}

	// 3:Methods To calculate Kilometer to Miles

	public double calculateMileshformKM(double km) {
		double answer = km * 0.62137119;
		return answer;
	}

	// 4: Methods To calculate Kilometer to Meter

	public double calculateMformKM(double km) {
		double answer = km * 1000;
		return answer;
	}

	// 5. Methods To calculate Meter To Kilometer

	public double calculateKMformM(double m) {
		double answer = m / 1000;
		return answer;
	}

	// 6. Methods To calculate Meter To Miles

	public double calculateMilesformM(double m) {
		double answer = m * 0.00062137;
		return answer;
	}

	public static void main(String[] args) {

		Distance_Converter dc = new Distance_Converter();
		Scanner sc = new Scanner(System.in);

		

		while (true) {
			System.out.println("=== Welcome To Distance Coverter ===");
			System.out.println();
			System.out.println("1. Miles To Kilometer ");
			System.out.println("2. Miles To Meter ");
			System.out.println("3. Kilometer To Miles ");
			System.out.println("4. Kilometer To Meter ");
			System.out.println("5. Meter To Kilometer");
			System.out.println("6. Miter To Miles ");
			System.out.println("7. For Exit ");
			
			int type = sc.nextInt();
			if (type == 1) {
				System.out.println(" == Miles To Kilometer Conversion == ");
				System.out.println("Enter Miles : ");
				double m1 = sc.nextDouble();
				double dc1 = dc.calculateKMformMiles(m1);
				System.out.println(m1 + " Miles Is Equals To = " + dc1 + " Kilometer");
				System.out.println();
			}

			else if(type == 2) {
				System.out.println("== Miles To Meter Conversion == ");
				System.out.println("Enter Miles : ");
				double m2 = sc.nextDouble();
				double dc2 = dc.calculateMformMiles(m2);
				System.out.println(m2 + " Miles is equals to = " + dc2 + " Meter");
				System.out.println();
				
			}

			else if(type == 3) {
				System.out.println("== Kilometer To Miles Conversion == ");
				System.out.println("Enter Kilometer : ");
				double m3 = sc.nextDouble();
				double dc3 = dc.calculateMileshformKM(m3);
				System.out.println(m3 + " Kilometer is equals to = " + dc3 + " Miles");
				System.out.println();
				
			}

			else if(type == 4) {
				System.out.println("== Kilometer To Meter Conversion == ");
				System.out.println("Enter Kilometer : ");
				double m4 = sc.nextDouble();
				double dc4 = dc.calculateMformKM(m4);
				System.out.println(m4 + "Kilometer is equals to = " + dc4 + " Meter");
				System.out.println();
				
			}

			else if(type == 5) {
				System.out.println("== Meter To Kilometer Conversion == ");
				System.out.println("Enter Meter : ");
				double m5 = sc.nextDouble();
				double dc5 = dc.calculateKMformM(m5);
				System.out.println(m5 + " Meter is equals to = " + dc5 + " Kilometer");
				System.out.println();
				
			}

			else if(type == 6) {
				System.out.println("== Meter To Miles Conversion == ");
				System.out.println("Enter Meter : ");
				double m6 = sc.nextDouble();
				double dc6 = dc.calculateMilesformM(m6);
				System.out.println(m6 + " Meter is equals to = " + dc6 + " Miles");
				System.out.println();
				
			}
				
			else {
				System.out.println();
				System.out.println("Thanks For Visiting");
				System.out.println();
				break;
			}
			
		}
	}
}
