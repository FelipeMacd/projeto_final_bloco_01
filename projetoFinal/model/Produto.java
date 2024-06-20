package projetoFinal.model;

public abstract class Produto {
	
	private String nome;
	private int tipo; //Console ou Hardware
	private int codProduto;
	private float preco;
	
	
	public Produto(String nome, int tipo, int codProduto, float preco) {
		this.nome = nome;
		this.tipo = tipo;
		this.codProduto = codProduto;
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}
	

	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getTipo() {
		return tipo;
	}



	public void setTipo(int tipo) {
		this.tipo = tipo;
	}



	public int getCodProduto() {
		return codProduto;
	}



	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}



	public float getPreco() {
		return preco;
	}



	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {
		
		String tipo = "";
		
		switch (this.tipo) {
		case 1:
			tipo = "Consoles";
			break;
		case 2:
			tipo = "Hardwares";
			break;
		}
		
		System.out.println("\n\n***********************************************************");
		System.out.println("\t\tInformações do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Nome do produto: " + this.nome);
		System.out.println("Tipo: " + tipo);
		System.out.println("Código: " + this.codProduto);
		System.out.println("Preço: " + this.preco);
		
		
	}
	
	
}
