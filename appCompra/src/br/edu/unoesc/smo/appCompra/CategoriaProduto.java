package br.edu.unoesc.smo.appCompra;

public enum CategoriaProduto {
	BEBIDAS(new CincoPorcento()), VESTUARIO(new VinteCincoPorcento());

	private CategoriaProduto(Descontos regraDesconto) {
		this.regraDesconto = regraDesconto;
	}

	private Descontos regraDesconto;

	public Double calcular(Produto produto) {
		return regraDesconto.calcularDesconto(produto);
	}
}
