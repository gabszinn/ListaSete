import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodo verificarCpf = new Metodo();

        System.out.print("Digite seu CPF no formato xxx.xxx.xxx-xx: ");
        verificarCpf.setCpf(scanner.next());

        switch (verificarCpf.getCpf().length()) {
            case 14:
                if (verificarCpf.getCpf().charAt(3) == '.' && verificarCpf.getCpf().charAt(7) == '.' && verificarCpf.getCpf().charAt(11) == '-') {
                    System.out.println("\nCPF válido");
                } else {
                    System.out.println("CPF inválido.");
                }
                break;
            default:
                System.out.println("CPF inválido.");
                break;
        }
        
        scanner.close();
    }
}
