package Classes;

import java.util.Observable;
import java.util.Observer;

public class Clientes implements Observer {
    private int id;
    private String nome;
    private String cpf;
    private String fone;

    public Clientes(String nome, String cpf, String fone) {
        this.nome = nome;
        this.cpf = cpf;
        this.fone = fone;
    }
    
     public Clientes() {
    }  
     
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(this.nome + ", o livro " + arg + " está disponível na nossa biblioteca");
	}  
    
}
