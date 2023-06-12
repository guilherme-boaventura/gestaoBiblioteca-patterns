package Classes;

public class MultaDiariaStrategy implements MultaStrategy {
	private final float MULTA_DIARIA = 2.00f;
	private int atraso;

	public MultaDiariaStrategy(int atraso) {
		this.atraso = atraso;
	}

	public MultaDiariaStrategy() {

	}

	public float calcularMulta(String dataDevolucao) {

		return MULTA_DIARIA * atraso;
	}

}
