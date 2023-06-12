package Classes;

public class Emprestimo {
	// vrificar quantidade de livros
	// e somar quando emprestado
	// verificar a quntiade de livros com a disponibiidade

	// verificr se o cliente já tem multa

	private int id_emprestimo;
	private int id_cliente;
	private int id_livro;
	private String data_emprestimo;
	private String data_devolucao;
	private String tipoMulta;

	public Emprestimo() {
	}

	public Emprestimo(int id_emprestimo, int id_cliente, int id_livro, String data_emprestimo, String data_devolucao,
			String tipoMulta) {
		this.id_emprestimo = id_emprestimo;
		this.id_cliente = id_cliente;
		this.id_livro = id_livro;
		this.data_emprestimo = data_emprestimo;
		this.data_devolucao = data_devolucao;
		this.tipoMulta = tipoMulta;
	}

	public String getTipoMulta() {
		return tipoMulta;
	}

	public void setTipoMulta(String tipoMulta) {
		this.tipoMulta = tipoMulta;
	}

	public int getId_emprestimo() {
		return id_emprestimo;
	}

	public void setId_emprestimo(int id_emprestimo) {
		this.id_emprestimo = id_emprestimo;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_livro() {
		return id_livro;
	}

	public void setId_livro(int id_livro) {
		this.id_livro = id_livro;
	}

	public String getData_emprestimo() {
		return data_emprestimo;
	}

	public void setData_emprestimo(String data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}

	public String getData_devolucao() {
		return data_devolucao;
	}

	public void setData_devolucao(String data_devolucao) {
		this.data_devolucao = data_devolucao;
	}

	public float calcularMulta() {
		MultaStrategy strategy = obterStrategyMulta();
		if (strategy != null) {
			return strategy.calcularMulta(data_devolucao);
		}
		return 0.0f;
	}
//modifiquei
	public MultaStrategy obterStrategyMulta() {
		if (tipoMulta.equalsIgnoreCase("fixa")) {
			return new MultaFixaStrategy();
		} else if (tipoMulta.equalsIgnoreCase("diaria")) {

			return new MultaDiariaStrategy();
		}

		return null;
	}
}
