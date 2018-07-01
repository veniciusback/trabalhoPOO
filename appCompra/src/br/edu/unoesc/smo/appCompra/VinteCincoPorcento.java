package br.edu.unoesc.smo.appCompra;

public class VinteCincoPorcento implements Descontos {

	@Override
	public Double calcularDesconto(Produto produto) {
		Double desconto = produto.getValorUnitario() * 0.25;
		return produto.getValorUnitario()  - desconto;
	}

}
