import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     double parcela_um,parcela_dois;
     Scanner teclado = new Scanner(System.in);
     System.out.println("Informe o primeiro número ");
     parcela_um = teclado.nextDouble();
     System.out.println("Foi informado "+parcela_um);
     System.out.println("Informe o segundo número ");
     parcela_dois = teclado.nextDouble();
     System.out.println("Foi informado "+parcela_dois);
     System.out.println("O maior número é "+ ((parcela_um > parcela_dois) ?
     parcela_um : parcela_dois));
  }
}