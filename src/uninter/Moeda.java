package uninter;

public abstract class Moeda { // Classe abstrata que representa uma Moeda
	
	double valor; // Valor da moeda

	public abstract void info(); // Método abstrato para exibir as informações da moeda
	
	public abstract double converter(); // Método abstrato para converter a moeda para real

	public boolean equals(Object obj) { // Verifica se o objeto atual é igual ao objeto passado como parâmetro
	    if (this == obj) { //// Se são a mesma referência de objeto
	        return true; //retorna verdaeiro
	    }
	    if (obj == null || getClass() != obj.getClass()) { // Verifica se o objeto atual é nulo ou pertence a uma classe diferente do objeto passado como parâmetro
	        return false; //retorno falso
	    }
	    Moeda outraMoeda = (Moeda) obj; // Converte o objeto passado como parâmetro para a classe Moeda
	    return Double.compare(outraMoeda.valor, valor) == 0; // Compara os valores das moedas para verificar igualdade
	}
	
	
}

