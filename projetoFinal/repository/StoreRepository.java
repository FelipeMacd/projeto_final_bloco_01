package projetoFinal.repository;

import projetoFinal.model.Produto;

public interface StoreRepository {

	
		//CRUD DO E-COMMERC
		public void cadastrar(Produto produto);
		public void listarProdutos();
		public void procurarPorCodigo(int tipo);
		public void atualizar(Produto produto);
		public void deletar(int codigo);
		
	
}
