package ecommerce.model;

public class Caderno extends Papelaria
{
	private int numero;
	private String folha;
	private int tamanho;
	
	public Caderno(int produtoId, String nome, double preco, int numero, String folha, int tamanho) {
		super(produtoId, nome, preco);
		this.numero = numero;
		this.folha = folha;
		this.tamanho = tamanho;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getFolha() {
		return folha;
	}

	public void setFolha(String folha) {
		this.folha = folha;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println(tamanho);
		System.out.println(folha);
		System.out.println(numero);
	}
		

	
}
	
	
	
