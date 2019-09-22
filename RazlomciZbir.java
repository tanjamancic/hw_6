package sestipaket;

import java.util.Scanner;

public class RazlomciZbir {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double n, k, suma = 0;
	System.out.print("Unesite n broj: ");
	n = sc.nextDouble();
	System.out.print("Unesite k broj: ");
	k = sc.nextDouble();
	suma = suma(n,k);
	System.out.println("Suma svih razlomaka je : " + suma);
	}
	static double suma (double n, double k) {
	double suma = 0;
	for ( double i = 0 ; i <= n+1 ; i++) {
	suma += ( (i+1) / (k+i) );
	}
	return suma;
	}

}
