package main.list.Pesquisa;

public class Livro {

    private String título;
    private String autor;
    private int anoDePublicação;

    public Livro(String título, String autor, int anoDePublicação) {
        this.título = título;
        this.autor = autor;
        this.anoDePublicação = anoDePublicação;
    }

    public String getTítulo() {
        return título;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicação() {
        return anoDePublicação;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "título='" + título + '\'' +
                ", autor='" + autor + '\'' +
                ", anoDePublicação=" + anoDePublicação +
                '}';
    }
}
