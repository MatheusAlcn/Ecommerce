package ecommerce.repository;

import ecommerce.model.Papelaria;

public interface Ecommercerepository 
{

	public void adicionarProduto(Papelaria produto);
		
	public void listarTodos();
	
	public void sair();

}

