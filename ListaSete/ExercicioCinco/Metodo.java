public class Metodo {
    private String numero;

    public void validarCorrigirNumero() {
        String numeroDigitado = numero.replace("-", "").trim();

        if (numeroDigitado.length() == 8) {
            String numeroComNove = "9" + numeroDigitado;
            String numeroCorrigido = numeroComNove.substring(0, 5) + "-" + numeroComNove.substring(5);
            System.out.print("Telefone possui apenas 8 dígitos.");
            System.out.print("Irei acrescentar o número '9' na frente.");
            System.out.print(" Número de telefone corrigido sem formatação: " + numeroComNove);
            System.out.print("Número de telefone corrigido com formatação: " + numeroCorrigido);
        } else {
            System.out.print("Este número de telefone é inválido.");
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
