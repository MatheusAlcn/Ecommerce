package ecommerce.model;

public class Caneta extends Papelaria
{

	private String ponta;
	private String Cor;
	private int fabricante;
	public Caneta(int produtoId, String nome, double preco, String ponta, String cor, int fabricante) {
		super(produtoId, nome, preco);
		this.ponta = ponta;
		Cor = cor;
		this.fabricante = fabricante;
	}
	public String getPonta() {
		return ponta;
	}
	public void setPonta(String ponta) {
		this.ponta = ponta;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public int getFabricante() {
		return fabricante;
	}
	public void setFabricante(int fabricante) {
		this.fabricante = fabricante;
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println();
	}

	
}
