package projetoFinal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuECommerce {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		
		while (true) {
			
			System.out.println("                                                     ");
			System.out.println("                CM Games e Periféricos               ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar todas os Produtos             ");
			System.out.println("            3 - Procurar por Produto                 ");
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
				
				break;
				
			case 2:
				System.out.println("Lista de todos os Produtos \n\n");
				
				break;
				
			case 3:
				System.out.println("Busca de Produto - por Id \n\n");
				
				break;
				
			case 4:
				System.out.println("Atualizar valor do produto \n\n");
				
				break;
				
			case 5:
				System.out.println("Venda de produto \n\n");
				
				break;
				
			
			}
	}

}
}