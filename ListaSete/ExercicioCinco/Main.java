import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metodo exercicio = new Metodo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de telefone: ");
        String numero = scanner.nextLine();

        
        exercicio.setNumero(numero);
        exercicio.validarCorrigirNumero();
        scanner.close();
    }
}
