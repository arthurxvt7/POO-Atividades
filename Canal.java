public class Canal {
    public class Canal {
    private int numero;
    private String nome;

    public Canal(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return numero + " - " + nome;
    }
}
}
