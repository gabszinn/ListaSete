import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira string: ");
        String string1 = scanner.nextLine();

        System.out.print("Digite a segunda string: ");
        String string2 = scanner.nextLine();

        Metodo comparador = new Metodo(string1, string2);
        comparador.compararStrings();
        scanner.close();
    }
}