package projetoFinal;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import projetoFinal.model.Hardware;
import projetoFinal.model.Produto;
import projetoFinal.util.Cores;

public class MenuECommerce {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		
		while (true) {
			

			Hardware h1 = new Hardware("RTX 4062", 2, 125, 2200.00f,"Placa de Video" );
			h1.visualizar();
			
			System.out.println("                                                     ");
			System.out.println("                CM Games e Hardwares                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar todas os Produtos             ");
			System.out.println("            3 - Procurar por tipo	                 ");
			System.out.println("            4 - Atualizar Valor do Produto           ");
			System.out.println("            5 - Venda do Produto                     ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			
			
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
			
			opcao = sc.nextInt();
			
			switch (opcao) {
			
			case 1:
				System.out.println("\nCadastrar Produto: \n\n");
				
				keyPress();
				break;
				
			case 2:
				System.out.println("Lista de todos os Produtos \n\n");
				
				keyPress();
				break;
				
			case 3:
				System.out.println("Busca de Produto - por Id \n\n");
				
				keyPress();
				break;
				
			case 4:
				System.out.println("Atualizar valor do produto \n\n");
				
				keyPress();
				break;
				
			case 5:
				System.out.println("Venda de produto \n\n");
				
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