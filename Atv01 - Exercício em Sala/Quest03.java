import java.util.Scanner;
class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do seu salário: R$");
		double salario = sc.nextDouble();
		System.out.print("Digite o valor da prestação: R$");
		double prestacao = sc.nextDouble();
		
		if(prestacao > salario * 20 / 100) {
			System.out.println("Emprestimo não concedido.");
		}else {
			System.out.println("Emprestimo concedido.");
		}
		
		sc.close();
	}

}