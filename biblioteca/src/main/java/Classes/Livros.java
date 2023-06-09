package Classes;

import java.util.Observable;

public class Livros extends Observable {
    private int codigo;
    private String titulo;
    private String autor;
    private String descricao;
    private int total;

    public Livros()
    { }

    public Livros(int codigo, String titulo, String autor,
            String descricao, int total)
    {   
        setCodigo(codigo);
        setTitulo(titulo);
        setAutor(autor);
        setDescricao(descricao);
        setTotal(total);
    }

    public int getCodigo()
    { return codigo; }

    public String getTitulo()
    { return titulo; }

    public String getAutor()
    { return autor; }

    public String getDescricao()
    { return descricao; }


    public int getTotal()
    { return total; }

    public void setCodigo(int codigo)
    { this.codigo = codigo; }

    public void setTitulo(String titulo)
    { this.titulo = titulo; }

    public void setAutor(String autor)
    { this.autor = autor; }

    public void setDescricao(String descricao)
    { this.descricao = descricao; }

    
    public void setTotal(int total)
    { this.total = total;}

    @Override
    public void notifyObservers(Object arg){
    	this.setChanged();
    	super.notifyObservers(arg);
    }
   
}
