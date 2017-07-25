package tr.org.linux.kamp.triangle;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner side = new Scanner(System.in);
		System.out.println("ilk kenar uzunluğunu girin");
		double a=side.nextDouble();
		System.out.println("ilk kenar uzunluğunu girin");
		double b=side.nextDouble();
		System.out.println("Üçgenin hipotenus uzunluğu:" + findHypo(a,b));
		System.out.println("Üçgenin alanı:" + getArea(a,b));
		System.out.println("Üçgenin çevresi:" + getPerimeter(a,b));
	}

	public static double getArea(double a,double b) {

		return a*b/2;
	}

	public static double findHypo(double a, double b) {

		return (Math.hypot(a, b));
	}

	public static double getPerimeter(double a,double b) {
	
		return b+a+findHypo(a,b);

	}
}
