package sestipaket;

import java.util.Scanner;

public class TrougaoObeStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Unesite n: ");
		n = sc.nextInt();
		trougao(n);
	}
	static void trougao (int n) {
		String prazan = "  ";
		String zvezdica = "* ";
		for (int i = n ; i >= 0 ; --i ) {
			System.out.println( prazan.repeat(i) + zvezdica.repeat(n-i) + "  " + zvezdica.repeat(n-i) + prazan.repeat(i) );
		}
	}
}
