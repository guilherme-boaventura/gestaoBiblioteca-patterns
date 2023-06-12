package Classes;


 public abstract class LivroFactoryImp extends LivroFactory {
    @Override
    public Livros criarLivro(int codigo, String titulo, String autor, String descricao, int total) {
        Livros livro = new Livros();
       livro.setCodigo(codigo);
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setDescricao(descricao);
        livro.setTotal(total);
        return livro;
    }
    
  }

