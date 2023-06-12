package Classes;

import java.util.Observable;



public class Livros extends Observable {
    private int codigo;
    private String titulo;
    private String autor;
    private String descricao;
    private int total;

    public Livros(LivroFactoryImp factory, int codigo, String titulo, String autor, String descricao, int total) {
        Livros livro = factory.criarLivro(codigo, titulo, autor, descricao, total);
        this.codigo = livro.getCodigo();
        this.titulo = livro.getTitulo();
        this.autor = livro.getAutor();
        this.descricao = livro.getDescricao();
        this.total = livro.getTotal();
    }

    public Livros() {
			}

	public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public void notifyObservers(Object arg) {
        this.setChanged();
        super.notifyObservers(arg);
    }
}