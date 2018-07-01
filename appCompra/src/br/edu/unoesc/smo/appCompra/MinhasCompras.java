package br.edu.unoesc.smo.appCompra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinhasCompras {

	Double total = 0.0;

	private List<Produto> produtos;

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	private class sortCrescente implements Comparator<Produto> {
		@Override
		public int compare(Produto x1, Produto x2) {
			if (x1.getValorUnitario() > x2.getValorUnitario()) {
				return 1;
			} else if (x1.getValorUnitario() < x2.getValorUnitario()) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	public List<Produto> listarProdutosCrescente() {
		this.produtos.sort(new sortCrescente());
		return this.produtos;
	}

	private class sortDecrescente implements Comparator<Produto> {
		@Override
		public int compare(Produto x1, Produto x2) {
			if (x1.getValorUnitario() < x2.getValorUnitario()) {
				return 1;
			} else if (x1.getValorUnitario() > x2.getValorUnitario()) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	public List<Produto> listarProdutosDecrescente() {
		this.produtos.sort(new sortDecrescente());
		return this.produtos;
	}

	public Double calcularValorTotal() {

		produtos.forEach(x -> {
			total += x.getCategoriaProduto().calcular(x);
		});

		return total;
	}
	
	public void adcionarCarrinho(Produto produto, int qnt) {
		if (produtos == null) {
			produtos = new ArrayList<>();
		}

		for (int i = 1; i <= qnt; i++) {
			produtos.add(produto);
		}

	}

}
