package projetoFinal.Controller;

import java.util.ArrayList;

import projetoFinal.model.Produto;
import projetoFinal.repository.StoreRepository;

public class StoreController implements StoreRepository {
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto: " + produto.getNome() + " foi cadastrado com sucesso!");
		
	}

	@Override
	public void listarProdutos() {
		for(var produto: listaProdutos) {
			produto.visualizar();
		}
	}

	@Override
	public void procurarPorCodigo(int codigo) {
		var produto = buscarNaCollection(codigo);
		
		if (produto != null) {
			produto.visualizar();
		}else {
			System.out.println("\nO produto com o Código: " + codigo + " não foi encontrado!");
		}
		
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getCodProduto());
		
		if (buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\nO Produto: " + produto.getNome() + " foi atualizada com sucesso");
		}else {
			System.out.println("\nO Produto: " + produto.getNome() + " não foi encontrada!");
		}
		
	}

	@Override
	public void deletar(int codigo) {
		var produto = buscarNaCollection(codigo);
		
		if (produto != null) {
			var nome = produto.getNome();
			if (listaProdutos.remove(produto) == true);
			System.out.println("\nO Produto: " + nome + " foi apagado com sucesso!");
		}else {
			System.out.println("\nO código do Produto não foi encontrado");
		}
		
	}
	
	public Produto buscarNaCollection(float numero) {
		for(var produto:listaProdutos) {
			if (produto.getCodProduto() == numero) {
				return produto;
			}
		}
		
		return null;
	}

}
