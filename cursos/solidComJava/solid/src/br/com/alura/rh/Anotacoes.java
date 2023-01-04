package br.com.alura.rh;

public class Anotacoes {

	/*
	 * Princípios da orientação a objetos
	 */

	/*
	 * Coesão
	 * 
	 * Coesão -> "União Harmônica entre uma coisa e outra". No mundo da programação
	 * é os atributos e métodos de uma classe trabalhar de forma harmônica, ou seja
	 * não existe atributos ou métodos que distoam do que esta classe quer
	 * representar.
	 * 
	 * "Classes não coesas tendem a crescer indefinidamente, o que as tornam difíceis de manter"
	 * .
	 * 
	 */

	/*
	 * Encapsulamento
	 *
	 * Encapsulamento -> "Incluir ou proteger alguma coisa em uma cápsula". É você
	 * proteger, blindar um atributo ou método contra manipulação externo a sua
	 * classe.
	 * 
	 * "Classes não encapsulaas permitem violação de regras de negócio, além de aumentarem o acoplamento"
	 * .
	 * 
	 */

	/*
	 * Acoplamento
	 * 
	 * Acoplamento -> "Ação de acoplar. Agrupamento aos pares". São dois componentes
	 * (classes) interligados em que uma classe se comunica com a outra ou se
	 * utiliza da outra.
	 * 
	 * "Classes acopladas causam fragilidade no código da aplicação, o que dificulta sua manutenção"
	 * .
	 * 
	 */

	/*
	 * Coesão: 
	 * 		Uma classe coesa faz bem uma única coisa 
	 * 		Classes coesas não devem ter várias responsabilidades 
	 * 
	 * Encapsulamento: 
	 * 		Getters e setters não são formas eficientes de aplicar encapsulamento 
	 * 		É interessante fornecer acesso apenas ao que é necessário em nossas classes 
	 * 		O encapsulamento torna o uso das nossasclasses mais fácil e intuitivo 
	 * 
	 * Acoplamento: 
	 * 		Acoplamento é a dependência entre classes 
	 * 		Acoplamento nem sempre é ruim, e que é impossível criar um sistema sem nenhum acoplamento 
	 * 		Devemos controlar o nível de acoplamento na nossa aplicação
	 * 
	 */
	
	/*
	 * Princípios do S.O.L.I.D
	 */
	
	/*
	 * Single responsibility principle  [s] (princípio da responsábilidade única) * Foca em coesão
	 * Just because you can, doesn't mean you should (Só porque você pode, não significa que você deveria)
	 * 
	 * "Uma classe deveria ter apenas um único motivo para mudar"
	 * -- Robert(Uncle Bob) Martin
	 * 
	 * Classes deveriam ter somente uma única responsábilidade.
	 * 
	 */
	
	/*
	 * Open closed principle [o] (princípio do aberto fechado)
	 * Open chest surgery is not needed when putting on a coat
	 * 
	 * "Entidades de software (classes, módulos, funções, etc.) devem estar abertas para extensão, porém fechadas para modificação"
	 * -- Bertrand Meyer
	 * 
	 * Se precisa adicionar uma nova lógica/regra de negócio, que faça isso em uma nova classe não modificando a já existente.
	 * 
	 */
	
	/*
	 * Liskov substittution principle [l] (princípio da substituição de Liskov)
	 * If it looks like a duck, quacks like a duck, but needs batteries - you probably have the wrong abstraction
	 * 
	 * "Se q(x) é uma propriedade demonstrável dos objetos x de tipo T, então q(y) deve ser verdadeiro para objetos y do tipo S, onde S é subtipo de T
	 * -- Bárbara Liskov
	 * 
	 * Toda classe derivada podem ser substituidas por suas classes base e que as classes base podem ser substituídas por qualuqer uma das suas subclasses.
	 * Favorecer a composição em detrimento da herança.
	 * 
	 */
	
	/*
	 * Interface segregation principle [i] (princípio da segregação de interfaces)
	 * You want me to plug this in, where?
	 * 
	 * "Uma classe não deveria ser forçada a depender de métodos que não utilizará"
	 * -- Robert (Uncle Bob) Martin
	 */
	
	/*
	 * Dependency inversion principle [d] (princípio da inversão de dependencia)
	 * would you solder a lamp directly to the electrical wiring in a wall?
	 * 
	 * "Abstrações não devem depender de implementações. Implementações devem depender de abstrações.
	 * -- Robert (Uncle Bob) Martin
	 */

}
