package Exejavabasics.Singleton;

public class User {
    // Campi privati
    private String nome;
    private int eta;

    // Costruttore di default
    public User() {
        this.nome = "Default";
        this.eta = 0;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    // Metodo per stampare le informazioni
    public void stampaInformazioni() {
        System.out.println("Nome: " + nome + ", Età: " + eta);
    }
}

