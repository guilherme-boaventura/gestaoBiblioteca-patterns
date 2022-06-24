# GestaoBiblioteca
##  Projeto Gestão de Biblioteca.
######  Projeto de Progrmação Orientada a Objeto para a disciplina de Linguagem de Programação ministrada pelo Professor Cefas Garcia Pereira

O projeto tem como objetivo:
O produto deve dar apoio à gestao de uma biblioteca escolar. Os ttulos da biblioteca podem ser livros, periodicos e outros. Cada título tem um número de exemplares, um período maximo de empréstimo e uma descricão. Um título só pode ser emprestado a leitores cadastrados, que pagar são multas se ultrapassarem o período de empréstimo. Professores cadastrados podem pedir reservas de determinados títulos, para que sejam consultados apenas na biblioteca durante a oferta de determinada disciplina. O produto deve permitir o tratamento de perdas e dar apoio ao controle de assinaturas de periódicos.

## Começando

![inicial](https://user-images.githubusercontent.com/73554815/175648756-44e9616b-6bca-400d-8ceb-d0b87ac52a88.PNG)
![emprestimo](https://user-images.githubusercontent.com/73554815/175648763-4e4cf473-bf17-4e69-ac04-f7a80fdd8c84.PNG)

## Executando os testes

        O projeto é executado normalmento pelo NetBenas IDE 14, inicia-se pela arquivo Principal.java.
O projeto teve funções baseadas em uma gestão de um administrador, por não ter banco de dados ainda é apenas um protótipo. A tela Principal tem ao todo 5 opções, aonde se digitr 5 no menu principal o programa se encerra. Caso digite aldo que não seja um número ou pressione Enter também se encerrará.
As demais opções são sobre as Classes do projeto, que é o grande foco sendo elas:

###### Análise dos testes de ponta a ponta  
        1. Livros : É a referÊncia da Classe básica do projeto, onde nele terá um novo menu em que permitirá o cadastro do livro. A parte importante no cadastro será a quantidade de exemplares daquele objeto, outro ponto é a chave primária que será gerada pela quantidade de cadastros em ordem. 
                -Segundo terá a possibilidade de pesquisar usando o código, e mostrará todas as informações cadastradas e a situação atual dele, por exemplo a quantidade de exemplares disponíveis, assim como o segundo o terceiro fará basicamente a mesma coisa diferencia-se apenas com a pesquisa sendo influência do título. 
                        -O quarto mostrará todos os livros cadastrados com apenas algumas informações, como o código e o nome.
        
        2. Professores: Possuem o mesmo gerenciamento dos livros, diferenciando das pesquisas que utilizam do cpf e do nome dos professores.   
        
        3. Leitor: É como os anteriores, apenas se diferencia da pesquisa, na qual utiliza-se do código e do cpf do Leitor.

        4. Ações: É aonde estão a funcionaliddade do projeto, possibilita a criação do empréstimo e outras.
        - Cadastro do Empréstimo: Aqui será realizado os empréstimos em que se informa o código de acesso do Leitor e o códgo do Livro, o sistema fará automaticamente o salvamento dos dados da data atual que foi feito o registro e a data limite de devolução sendo ela 14 dias depois. Além de possuir condicionais, como só será feito o cadastro caso o leitor não tenha multa, o livro não esteja reservado e o livro tenha disponibilidade.
                - Registro: Janela onde contêm todos os registros e empréstimos realizados e que não foram devolvidos.
                        -Devolver: Opção para devolução do empréstimo, mostrando que foi efetuado com sucesso.
                                -Reservar: Esclusivo para professores em que poe-se reservar determinado livro para ser utilizado pelo professor com seus alunos. Reservando pelo código o livro e impossibilitando o empréstimo de tal.
                                        -Listar Multa: Aqui é onde estará registrado as multa penentes, ela fará com que toda vez que se abre essa opção, ela verificará todo empréstimo feito e verá se há algum que passou da data de devolução e cobra automaticamente um preço fixo, R$5,00 como multa.
                                                -Pagar Multa: Opção onde possibilita pagar a multa, assim que realiazada o registro da multa será retirado. Além de possibilitar de ver se um Leitor possui multas.
                
######

## Desenvolvimento                
O projeto é apenas um protótipo, que deve ser usado apenas como base. As utilizações as funções podem estar em diversos projetos diferentes, por ser um sistema de gerenciamento, a capacidade de fazer empréstimo, devolver, reservar, gerar multa e pagar multa são serviços gerais e importante de diversas áreas.

## Construído com
 Interface Gráfica - Java (JOptionPane);
 
 ## Autores
######  Integrantes do Grupo: Jefferson, Samuel, Tiago e Vinicius
