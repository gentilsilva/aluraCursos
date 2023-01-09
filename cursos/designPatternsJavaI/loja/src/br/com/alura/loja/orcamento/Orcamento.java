package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacaoOrcamento;
	
	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacaoOrcamento = new EmAnalise();
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuanttidadeItens() {
		return quantidadeItens;
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacaoOrcamento.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	public void aprovar() {
		this.situacaoOrcamento.aprovar(this);
	}
	
	public void reprovar() {
		this.situacaoOrcamento.reprovar(this);
	}
	
	public void finalizar() {
		this.situacaoOrcamento.finalizar(this);
	}
	
	public SituacaoOrcamento getSituacaoOrcamento() {
		return situacaoOrcamento;
	}
	
	public void setSituacaoOrcamento(SituacaoOrcamento situacaoOrcamento) {
		this.situacaoOrcamento = situacaoOrcamento;
	}
	
}
