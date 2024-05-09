package ecommerce;

import java.util.Scanner;

import Color.util.Cores;
import ecommerce.contoller.EcommerceController;
import ecommerce.model.Caderno;
import ecommerce.model.Caneta;

public class Menu {


		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			int id;
			String nome;
			Double preco;
			String cor;
			int fabricante;
			String ponta;
			int numero;
			String folha;
			int tamanho;
			
			
			EcommerceController produtos = new EcommerceController();
			
			int opcao = 0;
			
			while (true) {
				

				System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("                    ECOMMERCE                        ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("                                                     ");
				System.out.println("            1 - Produto                              ");
				System.out.println("            2 - Cadastrar novo produto               ");
				System.out.println("            3 - Sair                                 ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção desejada:                          ");
				System.out.println("                                                     ");

				opcao = leia.nextInt();
				
				switch (opcao) {
				case 1:
					System.out.println("Produtos: ");
					produtos.listarTodos();
					
					break;
				case 2:
					System.out.println("Preço do Produto: ");
					preco = leia.nextDouble();
					System.out.println("Digite o ID Produto: ");
					id = leia.nextInt();
					leia.nextLine();
					System.out.println("Didigte o nome do produto: ");
					nome = leia.nextLine();
					if (nome.equalsIgnoreCase("Caneta")) {
						System.out.println("Didgite a cor da caneta: ");
						leia.nextLine();
						cor = leia.nextLine();
						System.out.println("Digite o fabrincante da caneta: ");
						fabricante = leia.nextInt();
						System.out.println("Digite o tamanho da Ponta: ");
						leia.nextLine();
						ponta = leia.nextLine();
						produtos.adicionarProduto(new Caneta(id, nome, preco, ponta, cor, fabricante));
					} else if (nome.equalsIgnoreCase("Caderno")) {
						System.out.println("Didgite o numero do caderno: ");
						numero = leia.nextInt();
						System.out.println("Didgite a foha do Caderno: ");
						leia.nextLine();
						folha = leia.nextLine();
						System.out.println("Didgite o tamanho do caderno: ");
						tamanho = leia.nextInt();
						produtos.adicionarProduto(new Caderno(id, nome, preco, numero, folha, tamanho));
					}
					break;
				case 3:

	                sobre();
	                System.exit(0);
	                leia.close();
				default:
					
					//System.out.println("Essa opção não existe!");
					break;
					
			}
			

		}

	}
		public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Agradecemos pelo seu compra: ");
			System.out.println("Nome da empresa");
			System.out.println("Desenvolvido por: Matheus Alcântara");
			System.out.println("*********************************************************");
		}
		

	}


