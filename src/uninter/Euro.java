package uninter;

public class Euro extends Moeda { ////subclasse da classe abstrata Moeda
	
	public Euro(double valor) {  // // Construtor da classe Euro que recebe o valor da moeda em euros como parâmetro
		this.valor = valor; // Define o valor da moeda em euros
	}

	// Sobrescreve o métodos da classe mãe
	@Override
	public void info() { //// Método para exibir as informações da moeda 
		System.out.println("Euro - " + valor); // Exibe as informações da moeda (tipo e valor)
	}

	@Override
	public double converter() { //// metodo para converter moeda
		return this.valor * 5.39; // Converte o valor da moeda para reais usando a taxa de câmbio  de 5.39
	}

	@Override
	public boolean equals(Object obj) { //// Verifica se o objeto atual é igual ao objeto passado como parâmetro
	    if (this == obj) {
	        return true; // Retorna true se os objetos são a mesma referência
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false; // Retorna false se o objeto é nulo ou pertence a uma classe diferente
	    }
	    Euro outraMoeda = (Euro) obj; // Converte o objeto para a classe Euro
	    return Double.compare(outraMoeda.valor, valor) == 0; // Compara os valores das moedas para verificar igualdade
	}
}

