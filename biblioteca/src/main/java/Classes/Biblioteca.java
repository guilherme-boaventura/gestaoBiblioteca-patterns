package Classes;

public class Biblioteca {
    private Livros[] livros;
    private Professores[] profe;
    private Clientes[] cli;
    private Emprestimo[] empre;
    private Multa[] multa;
    private int quantidade;
    private int quantidade1;
    private int quant2;
    private int quant3;
    private int quant4;
   

    public Biblioteca()
    {
        livros = new Livros[100];
        profe = new Professores[100];
        cli = new Clientes[100];
        empre = new Emprestimo[100];
        multa = new Multa[100];
        quantidade = 0;
        quantidade1 = 0;
        quant2 = 0;
        quant3 = 0;
        quant4 = 0;
    }


    public int getQuantidade()
    { return quantidade; }
    
    public int getQuantidade1()
    { return quantidade1; }
    
     public int getQuant2()
    { return quant2; }
    
    public int getQuant3()
    { return quant3; }
    
    public int getQuant4()
    { return quant4; }

    public void criaLivros()
    {
        livros = new Livros[100];
    }
   
    public void incluirLivro(Livros livro)
    {
           // livro.setCodigo(quantidade);
            livros[quantidade] = livro;
            quantidade++;
        
    }
   
    public Livros obterLivro(int cod)
    {
        for(int i=0;i<quantidade;i++)
            if (livros[i] != null)
                if (livros[i].getCodigo() == cod)
                        return livros[i];
        return null;
    }
   
    public Livros obterLivro(String tit)
    {
        for(int i=0;i<quantidade;i++)
            if (livros[i] != null)
                if (livros[i].getTitulo().indexOf(tit) >= 0)
                    return livros[i];
        return null;
    }
   
 
    public Livros getLivro(int posicao)
    {
        if (posicao < quantidade)
            return livros[posicao];
        else
            return null;
    }  
    
    
     public void criaProfessor()
    {
        profe = new Professores[100];
    }
   
    public void incluirProfessores(Professores prof)
    {
         quantidade1++;
         profe[quantidade1-1] = prof;
        
    }
   
    public Professores obterProfe(String cpf)
    {
        for(int i=0;i<quantidade1;i++)
            if (profe[i] != null)
                if (profe[i].getCpf().indexOf(cpf)>=0)
                    return profe[i];
        return null;
    }
   
    public Professores obterProfessor(String nome)
    {
        for(int i=0;i<quantidade1;i++)
            if (profe[i] != null)
                if (profe[i].getNome().indexOf(nome) >= 0)
                    return profe[i];
        return null;
    }
   
    public Professores getProfessor(int posicao)
    {
        if (posicao < quantidade1)
            return profe[posicao];
        else
            return null;
    }  
    public void criaCliente()
    {
        cli = new Clientes[100];
    }
   
    public void incluirCliente(Clientes cliente)
    {
            cli[quant2] = cliente;
            quant2++;
    }
   
    public Clientes obterCliente(int cod)
    {
        for(int i=0;i<quant2;i++)
            if (cli[i] != null)
                if (cli[i].getId()== cod)
                    return cli[i];
        return null;
    }
   
    public Clientes obterCliente(String cpf)
    {
        for(int i=0;i<quant2;i++)
            if (cli[i] != null)
                if (cli[i].getCpf().indexOf(cpf) >= 0)
                    return cli[i];
        return null;
    }
   
    public Clientes getCliente(int posicao)
    {
        if (posicao < quant2)
            return cli[posicao];
        else
            return null;
    }  
    
    public void criaEmprestimo()
    {
        empre = new Emprestimo[100];
    }
   
    public void incluirEmprestimo(Emprestimo emprestimo)
    {
            empre[quant3] = emprestimo;
            quant3++;
    }
   
  
     public Emprestimo obterEmpre_Cliente(int cod)
    {
        for(int i=0;i<quant3;i++)
            if (empre[i] != null)
                if (empre[i].getId_cliente()== cod)
                    return empre[i];
        return null;
    }
     
  public Emprestimo obterEmprestimo(int cod)
    {
        for(int i=0;i<quant3;i++)
            if (empre[i] != null)
                if (empre[i].getId_emprestimo()== cod)
                    return empre[i];
        return null;
    }
   
    public Emprestimo getEmprestimo(int posicao)
    {
        if (posicao < quant3)
            return empre[posicao];
        else
            return null;
    }  
    
    
    public void criaMulta()
    {
        multa = new Multa[100];
    }
    
     public void incluirMulta(Multa multas)
    {
            multa[quant4] = multas;
            quant4++;
    }
     
     public Multa obterMulta(int cod)
    {
        for(int i=0;i<quant4;i++)
            if (multa[i] != null)
                if (multa[i].getId_cliente()== cod)
                    return multa[i];
        return null;
    }
   
    public Multa getMulta(int posicao)
    {
        if (posicao < quant4)
            return multa[posicao];
        else
            return null;
    }  
    
   
}
