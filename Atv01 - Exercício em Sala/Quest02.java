import java.util.Scanner;
class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero qualquer: ");
		double numero = sc.nextDouble();
		
		if(numero > 0) {
			double dobro = numero * 2;
			System.out.println("O dobro do número é: " + dobro);
		}else {
			double quadrado = numero * numero;
			System.out.println("O número ao quadrado é: " + quadrado);
		}
		
		sc.close();
		
	}

}