
package App;

import Classes.Biblioteca;
import Classes.Clientes;
import Classes.Emprestimo;
import Classes.Livros;
import Classes.Multa;
import Classes.Professores;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 *
 * @author 1303214
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws ParseException
    {
        Biblioteca biblio = new Biblioteca();
        
        Professores profe;
       // Livros[] livros;
        Livros livro;
        Clientes cli;
        Emprestimo empre;
        Multa multa;
        int opcao = 0;
        
        String opcoes =
          "\n\n***Opções*** "+
          "\n1. Livros"+
          "\n2. Professores "+
          "\n3. Leitores"+
          "\n4. Ações"+
          "\n5. Finalizar"+
          "\n\nSelecione a opção: ";

        while (opcao != 5)
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,opcoes,
                    "Biblioteca ",JOptionPane.QUESTION_MESSAGE));

            switch(opcao)
            {
                case 1 -> {
                    int aux=0;
                    String aux1 =
                    "\n\n***Opções Livros*** "+
                    "\n1. Cadastrar Livro"+
                    "\n2. Pesquisar Livro (código)"+
                    "\n3. Pesquisar Livro (título)"+
                    "\n4. Listar Livros"+
                    "\n5. Voltar"+
                    "\n\nSelecione a opção: ";
                    while (aux != 5)
                     {
                        aux = Integer.parseInt(JOptionPane.showInputDialog(null,aux1,
                        "Livros ",JOptionPane.QUESTION_MESSAGE));
                        
                        switch(aux)
                    {
                             case 1 ->{
                                   cadastrar(biblio, "Livro");
                                }
                             case 2 -> {
                                    livro = biblio.obterLivro(Integer.parseInt(
                                    JOptionPane.showInputDialog("Digite código para pesquisar:")));
                                    if (livro != null)
                                        mostrarLivro(livro);
                                        else
                                            JOptionPane.showMessageDialog(null, "Livro Não Localizado!");
                                        }
                            case 3 -> {
                                    livro = biblio.obterLivro(JOptionPane.showInputDialog("Digite Título do Livro para pesquisar:"));
                                    if (livro != null)
                                        mostrarLivro(livro);
                                        else
                                            JOptionPane.showMessageDialog(null, "Livro Não Localizado!");
                                        }
                            case 4 -> {
                                    StringBuilder lista = new StringBuilder();
                                    lista.append("Lista de Livros Cadastrados:\n");
                                    for (int i=0;i<biblio.getQuantidade();i++)
                                      {
                                       livro = biblio.getLivro(i);
                                       lista.append(livro.getCodigo()).append(" - ").append(livro.getTitulo()).append(" - ").append(livro.getAutor()).append("; \n");
                                      }
                                        lista.append("Livros: ").append(biblio.getQuantidade());
                                        JOptionPane.showMessageDialog(null, lista.toString());
                                     }
                         }
                        }
                }   
                case 2 -> {
                  int aux=0;
                  String aux1 =
                  "\n\n***Opções Professor(a)*** "+
                  "\n1. Cadastrar Professor(a)"+
                  "\n2. Pesquisar Professor(a) (cpf)"+
                  "\n3. Pesquisar Professor(a) (nome)"+
                  "\n4. Listar Professor(a)"+
                  "\n5. Voltar"+
                  "\n\nSelecione a opção: ";
                  while (aux != 5)
                     {
                      aux = Integer.parseInt(JOptionPane.showInputDialog(null,aux1,
                    "Livros ",JOptionPane.QUESTION_MESSAGE));
                        
                   switch(aux)
                    {
                             case 1 ->{
                                   cadastrar(biblio, "Professor");
                                }
                             case 2 -> {
                                    profe = biblio.obterProfe(JOptionPane.showInputDialog("Digite CPF para pesquisar:"));
                                    if (profe != null)
                                        MostrarProfessores(profe);
                                        else
                                            JOptionPane.showMessageDialog(null, "Professor(a) Não Localizado!");
                                        }
                            case 3 -> {
                                    profe = biblio.obterProfessor( JOptionPane.showInputDialog("Digite nome do(a) Professor(a) para pesquisar:"));
                                    if (profe != null)
                                        MostrarProfessores(profe);
                                        else
                                            JOptionPane.showMessageDialog(null, "Professor(a) Não Localizado!");
                                        }
                            case 4 -> {
                                    StringBuilder lista = new StringBuilder();
                                    lista.append("Lista de Professores Cadastrados:\n");
                                    for (int i=0;i<biblio.getQuantidade1();i++)
                                      {
                                       profe = biblio.getProfessor(i);
                                       lista.append(profe.getCpf()).append(" - ").append(profe.getNome()).append(" - ").append(profe.getDisciplina()).append("; \n");
                                      }
                                        lista.append("Professores: ").append(biblio.getQuantidade1());
                                        JOptionPane.showMessageDialog(null, lista.toString());
                                     }
                         }
                        }
                    }
                case 3 -> {
                    int aux=0;
                    String aux1 =
                    "\n\n***Opções Leitor(a)*** "+
                    "\n1. Cadastrar Leitor(a)"+
                    "\n2. Pesquisar Leitor(a) (id)"+
                    "\n3. Pesquisar Leitor(a) (cpf)"+
                    "\n4. Listar Leitores"+
                    "\n5. Voltar"+
                    "\n\nSelecione a opção: ";
                    while (aux != 5)
                     {
                      aux = Integer.parseInt(JOptionPane.showInputDialog(null,aux1,
                        "Livros ",JOptionPane.QUESTION_MESSAGE));
                        
                    switch(aux)
                    {
                             case 1 ->{
                                   cadastrar(biblio, "Leitor");
                                }
                            case 2 -> {
                                    cli = biblio.obterCliente(JOptionPane.showInputDialog("Digite o ID para pesquisar:"));
                                    if (cli != null)
                                        MostrarCliente(cli);
                                        else
                                            JOptionPane.showMessageDialog(null, "Leitor(a) Não Localizado!");
                                        }
                            case 3 -> {
                                    cli = biblio.obterCliente(JOptionPane.showInputDialog("Digite O CPF para pesquisar:"));
                                    if (cli != null)
                                        MostrarCliente(cli);
                                        else
                                            JOptionPane.showMessageDialog(null, "Leitor(a) Não Localizado!");
                                        }
                            case 4 -> {
                                    StringBuilder lista = new StringBuilder();
                                    lista.append("Lista de Leitores Cadastrados:\n");
                                    for (int i=0;i<biblio.getQuant2();i++)
                                      {
                                       cli = biblio.getCliente(i);
                                       lista.append(cli.getId()).append(" - ").append(cli.getCpf()).append(" - ").append(cli.getNome()).append(" - ").append(cli.getFone()).append("; \n");
                                      }
                                        lista.append("Leitores: ").append(biblio.getQuant2());
                                        JOptionPane.showMessageDialog(null, lista.toString());
                                     }
                         }
                        }
                }
                case 4 ->  {
                                        //Ações
                    int aux=0;
                    String aux1 =
                    "\n\n***Opções Ações(a)*** "+
                    "\n1. Fazer Empréstimo)"+
                    "\n2. Consultar Empréstimos"+
                    "\n3. Devolver"+
                    "\n4. Reservar"+
                    "\n5. Consultar Multas"+
                    "\n6. Pagar Multa"+
                    "\n7. Voltar"+
                    "\n\nSelecione a opção: ";
                     while (aux != 7) {
                            aux = Integer.parseInt(JOptionPane.showInputDialog(null,aux1,
                            "Livros ",JOptionPane.QUESTION_MESSAGE));
                        
                                switch(aux){
                                        case 1 ->{
                                                cadastrar(biblio, "Emprestimo");
                                                //despois verificar se mult existe
                                                        }
                                        case 2->{
                                                StringBuilder lista = new StringBuilder();
                                                lista.append("Lista de Empréstimos feitos:\n");
                                                lista.append("ID - ").append(" Leitor - ").append(" Livro - ")
                                                            .append(" Empréstimo - ").append(" Devolução - ").append("; \n");
                                                
                                                for (int i=0;i<biblio.getQuant3();i++) {
                                                empre = biblio.getEmprestimo(i);
                                                lista.append(empre.getId_emprestimo()).append("   -   ").append(empre.getId_cliente()).append("     -     ")
                                                        .append(empre.getId_livro()).append("    -    ").append(empre.getData_emprestimo()).append("      -     ")
                                                        .append(empre.getData_devolucao()).append("; \n");
                                                }
                                                lista.append("Empréstimos: ").append(biblio.getQuant3());
                                                JOptionPane.showMessageDialog(null, lista.toString());
                                                }
                                        
                                        case 3->{ Devolver(biblio);}
                                        case 4->{ Reservar(biblio);}
                                        case 5->{ListaMulta(biblio);}
                                        case 6->{PagarMulta(biblio);}
                                                 }
                                            }
                                }
            }
        }
        System.out.println("# Fim do Programa #");
        System.out.println("bye...");
    }
   
    static Livros digitarLivro(Biblioteca biblio)
    {
        Livros liv = new Livros();
        liv.setCodigo(biblio.getQuantidade());
        liv.setTitulo(JOptionPane.showInputDialog("Título do Livro:"));
        liv.setAutor(JOptionPane.showInputDialog("Autor do Livro:"));
        liv.setDescricao(JOptionPane.showInputDialog("Descrição do Livro:"));
        liv.setTotal(Integer.parseInt(JOptionPane.showInputDialog("Quantidade deste exemplar:")));
        
        Clientes cli;
        for (int i=0;i<biblio.getQuant2();i++){
         cli = biblio.getCliente(i);
         liv.addObserver(cli);
         liv.notifyObservers(liv.getTitulo());
        }
        
        
        return liv;
    }
       
    static void mostrarLivro(Livros x)
    {
        String texto = """
                       Livro:
                       
                       Código: """+x.getCodigo()+
        "\nTítulo: "+x.getTitulo()+
        "\nAutor: "+x.getAutor()+
        "\nDescrição: "+x.getDescricao()+
        "\nQuantidade de Livros: "+x.getTotal();
        JOptionPane.showMessageDialog(null, texto, "Biblioteca: ",
                JOptionPane.WARNING_MESSAGE);
    }
    
    static Professores digitarProfe()
    {
        Professores prof = new Professores();
        prof.setCpf(JOptionPane.showInputDialog("CPF do(a) Professor(a):"));
        prof.setNome(JOptionPane.showInputDialog("Nome do(a) Professor(a):"));
        prof.setFormacao(JOptionPane.showInputDialog("Formação do(a) Professor(a):"));
        prof.setDisciplina(JOptionPane.showInputDialog("Disciplina do(a) Professor(a):"));
        prof.setTelefone(JOptionPane.showInputDialog("Telefone do(a) Professor(a):"));
        prof.setEmail(JOptionPane.showInputDialog("Email do(a) Professor(a):"));
        prof.setControle(-1);
        return prof;
    }
       
    static void MostrarProfessores(Professores x)
    {
        String texto = """
                       Livro:
                       
                       CPF: """+x.getCpf()+
        "\nNome: "+x.getNome()+
        "\nFormação: "+x.getFormacao()+
        "\nDisciplina: "+x.getDisciplina()+
        "\nTelefone: "+x.getTelefone()+
        "\nEmail: "+x.getEmail();
        JOptionPane.showMessageDialog(null, texto, "Biblioteca: ",
                JOptionPane.WARNING_MESSAGE);
    }
    
        static Clientes digitarCliente(Biblioteca biblio)
    {
        Clientes cli = new Clientes();
        cli.setId(biblio.getQuant2());
        cli.setCpf(JOptionPane.showInputDialog("CPF do Usurio: "));
        cli.setNome(JOptionPane.showInputDialog("Nome do Usuário: "));
        cli.setFone(JOptionPane.showInputDialog("´Telefone do Usuário: "));
        
        Livros livro;
        for (int i=0;i<biblio.getQuantidade();i++){
          livro = biblio.getLivro(i);
          livro.addObserver(cli);
        }
        return cli;
    }
       
    static void MostrarCliente(Clientes x)
    {
        String texto = """
                       Usuário:
                       
                       ID: """+x.getId()+
        "\nCPF: "+x.getCpf()+
        "\nNome: "+x.getNome()+
        "\nContato: "+x.getFone();
        JOptionPane.showMessageDialog(null, texto, "Biblioteca: ",
                JOptionPane.WARNING_MESSAGE);
    }
    
        static Emprestimo digitarEmprestimo(Biblioteca biblio)
    {  
        int aux=0,aux2=0;
        Emprestimo empre = new Emprestimo();
        Livros liv;
        Clientes cli;
        Professores prof;
        Multa multa;
        empre.setId_emprestimo(biblio.getQuant3()); 
        
        while(aux2==0){
            empre.setId_cliente(Integer.parseInt(JOptionPane.showInputDialog("Código de Acesso do Leitor:")));
            cli = biblio.obterCliente(empre.getId_cliente());
            for(int i=0;i<=biblio.getQuant4();i++){
            multa = biblio.getMulta(i);
            if(cli != null){
                if(multa==null || multa.getId_cliente() != cli.getId())
                     aux2=1;
                    else JOptionPane.showMessageDialog(null, "Leitor(a) possui Multas pendentes!");}
               else JOptionPane.showMessageDialog(null, "Leitor(a) Não Localizado!");
            }
        }
        while(aux==0){
            empre.setId_livro(Integer.parseInt(JOptionPane.showInputDialog("Código do Livro:")));
            liv = biblio.obterLivro(empre.getId_livro());
            if(liv != null) {
                for(int i =0;i<=biblio.getQuant4();i++){
                    prof = biblio.getProfessor(i);
                    if(prof == null  || liv.getCodigo()!= prof.getControle()) {
                        if (liv.getTotal()>0){ 
                            liv.setTotal(liv.getTotal()-1);
                            aux=1;         }
                                else JOptionPane.showMessageDialog(null, "Livro Indisponível!");
                                                            }
                        else JOptionPane.showMessageDialog(null, "Livro restrito pelo Professor: "+prof.getNome());
                                                        }
                             }
            else JOptionPane.showMessageDialog(null, "Livro Não Localizado!"); 
                }
        Date data = new Date();  
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");  
        //String s = formataData.format( data ); 
        empre.setData_emprestimo(formataData.format(data));
        JOptionPane.showMessageDialog(null, "Data do Empréstimo: "+ empre.getData_emprestimo());
        
        
         Date dataDevolucao = new Date();
        // Adiciona + 10 à data atual
        dataDevolucao.setDate(dataDevolucao.getDate() + 14);
       // String dataDevolucaoFormatada = formataData.format(dataDevolucao);
        empre.setData_devolucao(formataData.format(dataDevolucao));
        JOptionPane.showMessageDialog(null, "Data da Devolução: "+ empre.getData_devolucao()); 
        
        return empre;
    }
       
    static void MostrarEmprestimo(Emprestimo x)
    {
        String texto = """
                       Emprestimo:
                       
                       ID Emprestimo: """+x.getId_emprestimo()+
        "\nID Cliente: "+x.getId_cliente()+
        "\nID Livro: "+x.getId_livro()+
        "\nData do Emprestimo: "+x.getData_emprestimo()+
        "\nData de Devolução: "+x.getData_devolucao();
        JOptionPane.showMessageDialog(null, texto, "Biblioteca: ",
                JOptionPane.WARNING_MESSAGE);
    }
    
    static void Devolver( Biblioteca biblio){
        Emprestimo empre;
        Livros liv;
        int aux=0, op=0;
        while(aux==0){
            empre = biblio.obterEmprestimo(Integer.parseInt(JOptionPane.showInputDialog("Id do Empréstimo")));
            if (empre != null){
                MostrarEmprestimo(empre);   
                JOptionPane.showMessageDialog(null, "Devolução Realizada com sucesso", "Ações: ",
                JOptionPane.WARNING_MESSAGE);
                liv = biblio.obterLivro(empre.getId_livro());
                    if(empre.getId_livro()==liv.getCodigo())
                       liv.setTotal(liv.getTotal()+1);
                empre.setId_emprestimo(-1);
                empre.setId_cliente(-1);
                empre.setId_livro(-1);
                empre.setData_devolucao("");
                empre.setData_emprestimo("");
                aux=1;
            }
            else{ JOptionPane.showMessageDialog(null, "Emprestimo não encontrado!");
                        op = Integer.parseInt(JOptionPane.showInputDialog("Informe 0 caso deseje retornar ao menu Ações"));
                           if(op==0)break;}
     }                                  
    }
    
     static void Reservar(Biblioteca biblio){
      Professores prof;
      int aux=0, op=0;
        while(aux==0){
         prof = biblio.obterProfe(JOptionPane.showInputDialog("CPF do Professor (xxx.xxx.xxx-xx)"));
         if (prof != null){
             prof.setControle(Integer.parseInt(JOptionPane.showInputDialog("Livro para reservar")));
             aux=1;
         }
         else{ JOptionPane.showMessageDialog(null, "Professor não encontrado!");
                  op = Integer.parseInt(JOptionPane.showInputDialog("Informe 0 caso deseje retornar ao menu Ações"));
                  if(op==0)break;}
        }
      //Pedir o id do Prof
      //pedir o id do livro
     }
     
     //MULTA
     static void ListaMulta(Biblioteca biblio) throws ParseException{
        Multa multa= new Multa();
        Emprestimo empre;
        Date datahoje = new Date();  
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");  
        //String s = formataData.format( data );
         for(int i=0; i<biblio.getQuant3();i++){
            System.out.println("Teste1");
            if(biblio.getEmprestimo(i).getId_emprestimo()==-1)i++;
                else{
                    empre = biblio.getEmprestimo(i);
                    System.out.println("Teste2");
                    Date dataDevo= formataData.parse(empre.getData_devolucao());
                    System.out.println("Teste"+empre.getId_emprestimo());
                    if(empre.getId_emprestimo()>=0)
                        if(dataDevo.before(datahoje)){
                            biblio.incluirMulta(DigitarMulta(biblio, empre));
                                                    }
                    }
                                                }
         StringBuilder lista = new StringBuilder();
            lista.append("Lista de Multas:\n");
            for (int i=0;i<biblio.getQuant4();i++) {
            multa = biblio.getMulta(i);
            lista.append(multa.getId_multa()).append(" - ")
                 .append(multa.getId_cliente()).append(" - ")
                 .append(multa.getValor()).append("; \n");
                                      }
            lista.append("Multas: ").append(biblio.getQuant4());
            JOptionPane.showMessageDialog(null, lista.toString());
     }
     
    static Multa DigitarMulta(Biblioteca biblio, Emprestimo empre)
    {
        Multa multa = new Multa();
        multa.setId_multa(biblio.getQuant4());
        multa.setId_cliente(empre.getId_cliente());
        multa.setValor((float) 5.00);
        return multa;
    }
    
    static void PagarMulta(Biblioteca biblio)
    {
        Multa multa;
        multa = biblio.obterMulta(Integer.parseInt(JOptionPane.showInputDialog("Código de Acesso do Leitor:")));
        int aux=0, op=0;
        while(aux==1){
            if (multa != null){  
                JOptionPane.showMessageDialog(null, "Multa paga com sucesso", "Ações: ",
                JOptionPane.WARNING_MESSAGE);
                multa.setId_multa(0);
                multa.setId_cliente(0);
                multa.setValor(0);
                aux=1;
            }
                else
                        JOptionPane.showMessageDialog(null, "Leitor não possui multa!");
                        op = Integer.parseInt(JOptionPane.showInputDialog("Informe 0 caso deseje retornar ao menu Ações"));
                           if(op==0)break;
     }                                  
    }
     
    static void cadastrar(Biblioteca biblio, String x){
        if(null != x)switch (x) {
             case "Livro" -> {
                 biblio.incluirLivro(digitarLivro(biblio));
                 JOptionPane.showMessageDialog(null, x+ " Cadastrado!\nTotal: "+
                         biblio.getQuantidade()+" livro(s)");
            }
             case "Professor" -> {
                 biblio.incluirProfessores(digitarProfe());
                 JOptionPane.showMessageDialog(null, x+ " Cadastrado!\nTotal: "+
                         biblio.getQuantidade1()+" profesor(es)");
            }
             case "Leitor" -> {
                 biblio.incluirCliente(digitarCliente(biblio));
                 JOptionPane.showMessageDialog(null, x+ " Cadastrado!\nTotal: "+
                         biblio.getQuant2()+" Leitor(es)");
            }
             case "Emprestimo" -> {
                 biblio.incluirEmprestimo(digitarEmprestimo(biblio));
                 JOptionPane.showMessageDialog(null, x+ " Cadastrado!\nTotal: "+
                         biblio.getQuant3()+" Emprestimos(s)");
            }
             default -> {
            }
         }

    }
}
