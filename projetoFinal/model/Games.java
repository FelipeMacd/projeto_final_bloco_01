package projetoFinal.model;

public class Games extends Produto{
	
	private String fabricante;

	public Games(String nome, int tipo, int codProduto, float preco, String fabricante) {
		super(nome, tipo, codProduto, preco);
		this.fabricante = fabricante;
	}
	
	
	public String getFabricante() {
		return fabricante;
	}



	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}



	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Fabricante: "+fabricante);
	}

	
	

}
