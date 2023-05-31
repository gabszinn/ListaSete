public class Metodo {
    private String string1;
    private String string2;

    public Metodo(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    public void compararStrings() {
        int tamanhoString1 = string1.length();
        int tamanhoString2 = string2.length();

        System.out.println("String 1: " + string1);
        System.out.println("String 2: " + string2);

        System.out.println("Tamanho de \"" + string1 + "\": " + tamanhoString1 + " caracteres");
        System.out.println("Tamanho de \"" + string2 + "\": " + tamanhoString2 + " caracteres");

        if (tamanhoString1 == tamanhoString2) {
            System.out.println("As duas strings são do mesmo tamanho.");
        } else {
            System.out.println("As duas strings são de tamanhos diferentes.");
        }

        if (string1.equals(string2)) {
            System.out.println("As duas strings possuem o mesmo conteúdo.");
        } else {
            System.out.println("As duas strings possuem conteúdo diferente.");
        }
    }
}