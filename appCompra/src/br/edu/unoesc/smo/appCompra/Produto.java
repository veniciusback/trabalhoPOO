package br.edu.unoesc.smo.appCompra;

public class Produto {

	String descricao;
	CategoriaProduto categoriaProduto;
	Double valorUnitario;

	public Produto(String descricao, Double valorUnitario, CategoriaProduto categoriaProduto) {
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.categoriaProduto = categoriaProduto;
	}

	public CategoriaProduto getCategoriaProduto() {
		return categoriaProduto;
	}

	public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
		this.categoriaProduto = categoriaProduto;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
