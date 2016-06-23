package HackerRank;

import java.util.Scanner;

public class SumInt {

	static int sumInt( int val1, int val2) {
		return (val1 + val2);
	}
	
	static int arraySum() {
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size " );
		int arraySz = in.nextInt();
		in.close();
		if (arraySz > 0 ) { 
			Scanner arrayScan = new Scanner(System.in);
			arrayScan = arrayScan.useDelimiter("\\s");
			while ( arrayScan.hasNextInt() ) {
				sum += arrayScan.nextInt();
			}
		}
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int val1 = in.nextInt();
		int val2 = in.nextInt();
		int sum = sumInt(val1, val2);
		System.out.println("value of Sum : " + sum);

		
	}
}
