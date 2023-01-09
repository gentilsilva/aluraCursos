package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class Pedido {

	private String Cliente;
	private LocalDateTime data;
	private Orcamento orcamento;
	
	public Pedido(String cliente, LocalDateTime data, Orcamento orcamento) {
		this.Cliente = cliente;
		this.data = data;
		this.orcamento = orcamento;
	}

	public String getCliente() {
		return Cliente;
	}

	public void setCliente(String cliente) {
		Cliente = cliente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}	
	
}
