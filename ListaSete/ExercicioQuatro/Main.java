import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metodo metodo = new Metodo();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número até 99: ");
        int numero = scanner.nextInt();

        metodo.setNumero(numero);
        String numeroExtenso = metodo.converterNumeroExtenso();

        System.out.println("Número por extenso: " + numeroExtenso);
        scanner.close();
    }
}