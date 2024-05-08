package ecommerce;

import java.util.Scanner;

import Color.util.Cores;

public class Menu {


		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			
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
				System.out.println("            3 - Carrinho                             ");
				System.out.println("            4 - visualizar detalhes do produto       ");
				System.out.println("            5 - Cadastrar novo cliente               ");
				System.out.println("            6 - Informações do cliente               ");
				System.out.println("            7 - Sair                                 ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção desejada:                          ");
				System.out.println("                                                     ");

				//leia.nextInt();
				
				if (opcao == 9) {
					System.out.println("\nAgradecemos por escolher nossa loja! Até a próxima");
					sobre();
					leia.close();
					System.exit(0);
					}
				
				switch (opcao) {
				case 1:
					System.out.println("Produto");
					

					break;
				case 2:
					System.out.println("Cadastrar Produto");
					

					break;
				case 3:
					System.out.println("Carrinho");

		
					break;
				case 4:
					System.out.println("visualizar detalher do produto");
					

					break;
				case 5:
					System.out.println("Cadastrar novo Cliente");


					break;
				case 6:
					System.out.println("informações do cliente");


					break;
				case 7:
					
					System.out.println("Sair");
					System.out.println("\nAgradecemos por escolher nossa loja! Até a próxima");
	                sobre();
	           //     leia.close();
	                System.exit(0);
					break;
				default:
					
					System.out.println("Essa opção não existe!");
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


