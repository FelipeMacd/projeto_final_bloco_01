package projetoFinal;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import projetoFinal.Controller.StoreController;
import projetoFinal.model.Games;
import projetoFinal.model.Hardware;
import projetoFinal.model.Produto;
import projetoFinal.util.Cores;

public class MenuECommerce {

	public static void main(String[] args) {
		
		StoreController produtos = new StoreController();
		
		Scanner sc = new Scanner(System.in);
		
		int opcao, tipo, codProduto;
		String nome, fabricante, categoria;
		float preco;
		
		Games game1 = new Games("Xbox Series X", 1, 10, 2399.99f, "Microsoft");
		produtos.cadastrar(game1);
		
		Games game2 = new Games("Playstation 5", 1, 11, 3299.99f, "Sony");
		produtos.cadastrar(game2);
		
		Hardware hw1 = new Hardware("RTX 4060", 1, 20, 2159.99f, "Placa de Video");
		produtos.cadastrar(hw1);
		
		Hardware hw2 = new Hardware("I5 13400X", 1, 21, 2159.99f, "Processador");
		produtos.cadastrar(hw2);
		
		while (true) {
			
			System.out.println(Cores.TEXT_BLUE + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                CM Games e Hardwares                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar todas os Produtos             ");
			System.out.println("            3 - Procurar por Código	                 ");
			System.out.println("            4 - Atualizar Dados do Produto           ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			
			try {
				opcao = sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nDigite uma das opções!");
				sc.nextLine();
				opcao = 0;
			}
				
			if (opcao == 6) {
				System.out.println("\nCM Games e Periféricos - Tudo Sua Jogatina");
				sc.close();
				System.exit(0);
			}
			
			
			switch (opcao) {
			
			case 1:
				System.out.println("\n\t\tCADASTRAR PRODUTO \n");
				sc.nextLine();
				
				System.out.println("Digite o nome do produto: ");
				nome = sc.nextLine();
				System.out.println("Digite o código do Produto: ");
				sc.skip("\\R?");
				codProduto = sc.nextInt();
				
				do {
					System.out.println("Digite o Tipo do Produto (1-Games ou 2-Hardware): ");
					tipo = sc.nextInt();
				}while(tipo < 1 && tipo > 2);
				
				System.out.println("Digite o Preço do Produto (R$): ");
				preco = sc.nextFloat();
				sc.nextLine();
				
				switch(tipo) {
					case 1 -> {
						System.out.println("Digite o Nome do Fabricante: ");
						fabricante = sc.nextLine();
						produtos.cadastrar(new Games(nome, tipo, codProduto, preco, fabricante));
					}
					case 2 -> {
						System.out.println("Digite o nome da Categoria do Produto:S ");
						categoria = sc.nextLine();
						produtos.cadastrar(new Hardware(nome, tipo, codProduto, preco, categoria));
						sc.nextLine();
					}
				}
				
				keyPress();
				break;
				
			case 2:
				System.out.println("Lista de todos os Produtos \n\n");
				
				produtos.listarProdutos();
				keyPress();
				break;
				
			case 3:
				System.out.println("Busca de Produto - por Id \n\n");
				
				System.out.println("Digite o código do Produto: ");
				codProduto = sc.nextInt();
				
				produtos.procurarPorCodigo(codProduto);
				
				keyPress();
				break;
				
			case 4:
				System.out.println("Atualizar dados do Produto \n\n");
				
				System.out.println("Digite o Código do Produto que deseja Atualizar: ");
				codProduto = sc.nextInt();
				
				var buscaProduto = produtos.buscarNaCollection(codProduto);
				
				if (buscaProduto != null) {
					

					tipo = buscaProduto.getTipo();
					
					sc.nextLine();
					System.out.println("Digite o Nome do Produto: ");
					nome = sc.nextLine();

					System.out.println("Digite o Preço do Produto (R$): ");
					preco = sc.nextFloat();
					
					sc.nextLine();

					switch (tipo) {
						case 1 -> {
							System.out.println("Digite o nome do fabricante: ");
							fabricante = sc.nextLine();

							produtos.atualizar(new Games(nome, tipo, codProduto, preco, fabricante));

						}
						case 2 -> {
							System.out.println("Digite o nome da categoria do produto: ");
							categoria = sc.nextLine();

						produtos.atualizar(new Hardware(nome, tipo, codProduto, preco, categoria));

						}
						default -> {
						System.out.println("Tip de conta inválido!");

						}
					}
				}else {
					System.out.println("O produto não foi encontrado!");
				}
				keyPress();
				break;
				
			case 5:
				System.out.println("Apagar Produto: \n\n");
				
				System.out.println("Digite o código do produto que deseja apagar: ");
				codProduto = sc.nextInt();
				
				produtos.deletar(codProduto);
				
				keyPress();
				break;
				
			default:
				System.out.println("\nOpção Inválida");
				
				keyPress();
				break;
				
			
			}
	}

}
	
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}