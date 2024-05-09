package ecommerce.contoller;

import java.util.ArrayList;

import ecommerce.model.Papelaria;
import ecommerce.repository.Ecommercerepository;

public class EcommerceController implements Ecommercerepository
{
	
	private ArrayList<Papelaria> listarProdutos = new ArrayList<Papelaria>();
	int numero = 0;
	
	@Override
	public void adicionarProduto(Papelaria produto) {
		listarProdutos.add (produto);
		}
	

	@Override
	public void listarTodos() {
		for (var Papelaria : listarProdutos) {
			 Papelaria.visualizar();
	}
	}

	@Override
	public void sair() {
		 System.exit(0);
		
	}

}
