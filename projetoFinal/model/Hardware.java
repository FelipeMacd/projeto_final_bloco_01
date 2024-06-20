package projetoFinal.model;

public class Hardware extends Produto {
	
	private String categoria;

	public Hardware(String nome, int tipo, int codProduto, float preco, String categoria) {
		super(nome, tipo, codProduto, preco);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Categoria: "+categoria);
	}

	
}

