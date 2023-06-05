package Model;

public class Telefone {
    private String numero;
    private String tipo;

    public Telefone(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
    public Telefone(Telefone telefone) {
    	this.numero = telefone.getNumero();
        this.tipo = telefone.getTipo();
    }

    // Getters e setters

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

