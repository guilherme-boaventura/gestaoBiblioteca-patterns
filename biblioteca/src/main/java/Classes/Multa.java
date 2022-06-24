package Classes;

public class Multa {
    private int id_multa;
    private int id_cliente;
    private float valor;

    public Multa(int id_multa, int id_cliente, float valor) {
        this.id_multa = id_multa;
        this.id_cliente = id_cliente;
        this.valor = valor;
    }

    public Multa() {
    }

    public int getId_multa() {
        return id_multa;
    }

    public void setId_multa(int id_multa) {
        this.id_multa = id_multa;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
}
