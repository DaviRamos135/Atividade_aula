public class Livro2 {
    String titulo;
    String autor;
    int numPaginas;

    public Livro2(String titulo, String autor, int numPaginas){
        this.titulo= titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void exibirInformacoes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numPaginas);
    }

    public static void main(String[] args) {
        Livro2 meuLivro = new Livro2("O senhor dos Anéis", "J.R.R. Tolkien", 1200);
    }
}
