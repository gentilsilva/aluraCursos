package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDesconto {

	public static void main(String[] args) {		
		Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);
		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		System.out.println(calculadora.calcular(primeiroOrcamento));
		System.out.println(calculadora.calcular(segundoOrcamento));
	}
	
}
