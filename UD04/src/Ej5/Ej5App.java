package Ej5;

public class Ej5App {

	public static void main(String[] args) {
		int A=2;
		int B=4;
		int C=6;
		int D=8;
		
		B=C;
		C=A;
		A=D;
		D=B;
		
		System.out.println("Valor A = "+A+", B = "+B+", C = "+C+", D = "+D);
	}

}
