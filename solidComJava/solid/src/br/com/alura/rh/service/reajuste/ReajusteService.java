package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {

	private List<ValidacaoReajuste> validacoes;	
	
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}
	
	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
//		Utilizando essa forma, utilizamos o princípio do open closed princípio. Ao utilizar interfaces, diminuímos o acoplamento pois, interfaces são mais estáveis.
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));
		
//		Utilizando essa forma, utilizamos do princípio de responsábilidade única. Mas, ao utilizar isso teríamos que modifcar essa classe sempre que modificasse nosa regra
		/*
		 * ValidacaoPercentualReajuste validacaoPercentual = new ValidacaoPercentualReajuste();
		 * ValidacaoPeriodicidadeEntreReajustes validacaoPeriodicidade = new ValidacaoPeriodicidadeEntreReajustes();
		 * validacaoPercentual.validar(funcionario, aumento);
		 * validacaoPeriodicidade.validar(funcionario, aumento);
		 * 
		 */
		
		BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
		funcionario.getDadosPessoais().setSalario(salarioReajustado);
	}
	
}
