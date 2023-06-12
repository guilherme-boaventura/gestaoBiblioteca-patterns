package Classes;

public abstract class LivroFactory {
    public abstract Livros criarLivro(int codigo, String titulo, String autor, String descricao, int total);
}
