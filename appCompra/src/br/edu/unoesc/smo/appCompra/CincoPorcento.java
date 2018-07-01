package br.edu.unoesc.smo.appCompra;

public class CincoPorcento implements Descontos{

	@Override
	public Double calcularDesconto(Produto produto) {
		Double desconto = produto.getValorUnitario() * 0.05;
		return produto.getValorUnitario()  - desconto;
	}

}
