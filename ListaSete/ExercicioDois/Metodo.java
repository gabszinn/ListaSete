
public class Metodo {
    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String reversor;
    public String getReversor() {
        
    reversor = "";
        for 
        
        (int i = nome.length() - 1; i >= 0; i--) {
            char caractere = Character.toUpperCase(nome.charAt(i));
            reversor += caractere;

        }

        return reversor;
    }
      public void setReversor(String reversor) {
             this.reversor = reversor;
    }
        
}