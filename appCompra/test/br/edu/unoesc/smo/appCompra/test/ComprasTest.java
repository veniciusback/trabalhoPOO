package br.edu.unoesc.smo.appCompra.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import br.edu.unoesc.smo.appCompra.CategoriaProduto;
import br.edu.unoesc.smo.appCompra.MinhasCompras;
import br.edu.unoesc.smo.appCompra.Produto;

public class ComprasTest {

	@Test
	public void orderProdutosDecrescenteTest() {
		MinhasCompras minhasCompras = new MinhasCompras();

		Produto produto = new Produto("COCA", 5.75, CategoriaProduto.BEBIDAS);
		minhasCompras.adcionarCarrinho(produto, 1);
		produto = new Produto("VODKA", 29.65, CategoriaProduto.BEBIDAS);
		minhasCompras.adcionarCarrinho(produto, 1);
		produto = new Produto("CAMISETA", 48.75, CategoriaProduto.VESTUARIO);
		minhasCompras.adcionarCarrinho(produto, 1);

		List<Produto> produtos = minhasCompras.listarProdutosDecrescente();

		assertNotNull(produtos);
		assertEquals("CAMISETA", produtos.get(0).getDescricao());
		assertEquals("VODKA", produtos.get(1).getDescricao());
		assertEquals("COCA", produtos.get(2).getDescricao());

	}

	@Test
	public void orderProdutosCrecenteTest() {
		MinhasCompras minhasCompras = new MinhasCompras();

		Produto produto = new Produto("COCA", 5.75, CategoriaProduto.BEBIDAS);
		minhasCompras.adcionarCarrinho(produto, 1);
		produto = new Produto("VODKA", 29.65, CategoriaProduto.BEBIDAS);
		minhasCompras.adcionarCarrinho(produto, 1);
		produto = new Produto("CAMISETA", 48.75, CategoriaProduto.VESTUARIO);
		minhasCompras.adcionarCarrinho(produto, 1);

		List<Produto> produtos = minhasCompras.listarProdutosCrescente();

		assertNotNull(produtos);
		assertEquals("COCA", produtos.get(0).getDescricao());
		assertEquals("VODKA", produtos.get(1).getDescricao());
		assertEquals("CAMISETA", produtos.get(2).getDescricao());

	}

	@Test
	public void totalizarCompraBebidas() {
		Produto produto = new Produto("VODKA", 20.00, CategoriaProduto.BEBIDAS);
		produto.setCategoriaProduto(CategoriaProduto.BEBIDAS);
		produto.setValorUnitario(10.00);

		ArrayList<Produto> produtos = new ArrayList<>();
		produtos.add(produto);

		MinhasCompras minhasCompras = new MinhasCompras();
		minhasCompras.setProdutos(produtos);

	}

	@Test
	public void descontoVestuarioTest() {
		MinhasCompras minhasCompras = new MinhasCompras();

		Produto produto1 = new Produto("CAMISA", 300.00, CategoriaProduto.VESTUARIO);
		minhasCompras.adcionarCarrinho(produto1, 1);

		Produto produto2 = new Produto("CALÇA", 150.10, CategoriaProduto.VESTUARIO);
		minhasCompras.adcionarCarrinho(produto2, 1);

		assertEquals(Double.valueOf(337.575), minhasCompras.calcularValorTotal());
	}

	@Test
	public void descontoBebidasTest() {
		MinhasCompras minhasCompras = new MinhasCompras();
		Produto produto1 = new Produto("FANTA", 5.50, CategoriaProduto.BEBIDAS);
		minhasCompras.adcionarCarrinho(produto1, 3);

		Produto produto2 = new Produto("KUAT", 3.99, CategoriaProduto.BEBIDAS);
		minhasCompras.adcionarCarrinho(produto2, 1);

		assertEquals(Double.valueOf(19.4655), minhasCompras.calcularValorTotal());
	}

	@Test
	public void adcionarCarrinhoTest() {
		MinhasCompras minhasCompras = new MinhasCompras();
		Produto produto = new Produto("BERMUDA", 350.00, CategoriaProduto.VESTUARIO);
		minhasCompras.adcionarCarrinho(produto, 1);

		assertNotNull(minhasCompras.getProdutos());
	}

}
