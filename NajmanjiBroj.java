package sestipaket;

import java.util.Scanner;

public class NajmanjiBroj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, naj;
		System.out.print("Unesite 1. broj: ");
		a = sc.nextInt();
		System.out.print("Unesite 2. broj: ");
		b = sc.nextInt();
		System.out.print("Unesite 3. broj: ");
		c = sc.nextInt();
		naj = najmanji(a, b, c);
		System.out.print("Najmanji broj je: " + naj);	
	}
	static int najmanji (int a, int b, int c) {
		int d;
		if ( a < b && a < c ) d = a;
		else if ( b < a && b < c ) d = b;
		else d = c;
		return d;
	}
}
