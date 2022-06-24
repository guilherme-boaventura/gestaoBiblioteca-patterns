package Classes;


public class Professores {

    private String formacao;
    private String disciplina;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private int controle;
  public Professores()
    { }
    public Professores(String formacao,String disciplina, String nome, String cpf, String telefone, String email) {
        this.formacao = formacao;
        this.disciplina = disciplina;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email; 
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public String getDisciplina() {
        return disciplina;
    }
   
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
   
    public int getControle() {
        return controle;
    }
   
    public void setControle(int controle) {
        this.controle = controle;
    }

}