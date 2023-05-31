public class Metodo {
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpfSemSeparador() {
        String cpfSemSeparador = cpf.replace(".", "").replace("-", "");
        return cpfSemSeparador;
    }

    public void setCpfSemSeparador(String cpfSemSeparador) {
        this.cpf = cpfSemSeparador;
    }
}
