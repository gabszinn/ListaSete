import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodo reverterNome = new Metodo();

        System.out.println("Digite um nome: ");
        reverterNome.setNome(scanner.nextLine());

        System.out.println("" + reverterNome.getReversor());

        scanner.close();
    }
}