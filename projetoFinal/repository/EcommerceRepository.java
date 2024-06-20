package projetoFinal.repository;

import projetoFinal.model.Produto;

public interface EcommerceRepository {

	
		//CRUD DO E-COMMERC
		public void cadastrar(Produto produto);
		public void listarProdutos();
		public void procurarPorTipo(int tipo);
		public void atualizar(Produto produto);
		public void deletar(Produto codigo);
		
		
		public void venda();
}
