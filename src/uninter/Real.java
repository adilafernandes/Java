package uninter;

public class Real extends Moeda { //subclasse da classe abstrata Moeda
	
	public Real(double valor) { // Construtor da classe Real que recebe o valor da moeda em reais como parâmetro
		this.valor = valor; // Define o valor da moeda em reais
	}

	// Sobrescreve os métodos da classe mãe
	@Override 
	public void info() { // Método para exibir as informações da moeda 
		 System.out.println("Real - " + valor ); // Exibe as informações da moeda (tipo e valor)
	}

	@Override
	public double converter() { // metodo para converter moeda
		return this.valor; // Retorna o valor da moeda em reais
	}

	@Override
	public boolean equals(Object obj) { // Verifica se o objeto atual é igual ao objeto passado como parâmetro
	    if (this == obj) {
	        return true; // Retorna true se os objetos são a mesma referência
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false; // Retorna false se o objeto é nulo ou pertence a uma classe diferente
	    }
	    Real outraMoeda = (Real) obj; // Converte o objeto para a classe Real
	    return Double.compare(outraMoeda.valor, valor) == 0; // Compara os valores das moedas para verificar igualdade
	}


} 

