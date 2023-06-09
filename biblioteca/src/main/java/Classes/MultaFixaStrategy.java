package Classes;

public class MultaFixaStrategy implements MultaStrategy {
private final float MULTA_FIXA = 10;
	@Override
	public float calcularMulta(String dataDevolucao) {
		
		return MULTA_FIXA;
	}

}
