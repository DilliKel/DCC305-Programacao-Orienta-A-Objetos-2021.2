import java.util.Scanner;
class Main {

	public static void main(String[] args) { 
		
		int n = 0;
		int menor, maior;
		menor = maior = n;
		try (Scanner sc = new Scanner(System.in)) {
			do { 

			System.out.print("Digite um número: "); 
			n = sc.nextInt(); 
			
			if (n < menor) {
				menor = n;
			}
			if (n > maior) {
				maior = n;
			}

			} while (n>0);
		} 
		
		System.out.println("Menor numero é: " + menor);
		System.out.println("Maior numero é: " + maior);
		
	} 

}