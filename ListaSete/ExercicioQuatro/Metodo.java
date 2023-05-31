public class Metodo {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String converterNumeroExtenso() {
        if (numero < 0 || numero > 99) {
            return "Número inválido";
        }

        String[] unidades = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove",
                "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete",
                "dezoito", "dezenove"};

        String[] dezenas = {"", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta",
                "oitenta", "noventa"};

        if (numero < 20) {
            return unidades[numero];
        } else {
            int unidade = numero % 10;
            int dezena = numero / 10;

            if (unidade == 0) {
                return dezenas[dezena];
            } else {
                return dezenas[dezena] + " e " + unidades[unidade];
            }
        }
    }
}