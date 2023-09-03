package uninter;

import java.util.ArrayList; // Importação da classe ArrayList para utilizar uma lista

public class Cofrinho { // Classe que representa um cofrinho para armazenar moedas
	
	
	private ArrayList<Moeda> listarMoedas; // Lista de moedas no cofrinho
	
     // Construtor da classe Cofrinho
    public Cofrinho() {
        listarMoedas = new ArrayList<>(); //// Inicializa a lista de moedas vazia
    }

   
    public void adicionar(Moeda moeda) { // Método para adicionar uma moeda ao cofrinho
        listarMoedas.add(moeda); // Adiciona a moeda na lista de moedas do cofrinho
    }
	

    public boolean remover(Moeda moeda) { // Método para remover uma moeda do cofrinho
        return listarMoedas.removeIf(m -> m.equals(moeda)); // Remove a moeda da lista de moedas do cofrinho
     
    }

    
    public void listagemMoedas() { // Método para listar as moedas presentes no cofrinho
        if (listarMoedas.isEmpty()) { // // Verifica se o cofrinho está vazio
            System.out.println("O cofrinho está vazio.");
            return; // // Retorna, encerrando o método
        } 
            for (Moeda moeda : listarMoedas) { //Itera sobre cada moeda na lista de moedas
                moeda.info(); // // Exibe as informações da moeda
            }
        }

    // Método para calcular o valor total convertido das moedas no cofrinho
    public double totalConvertido() {
        if (listarMoedas.isEmpty()) { // Verifica se o cofrinho está vazio
            return 0; // Retorna 0 quando o cofrinho está vazio
        }
        
        double valorAcumulado = 0; //// Inicializa a variável para acumular o valor total convertido das moedas
        
        for (Moeda moeda : listarMoedas) { //Itera sobre cada moeda na lista de moedas do cofrinho
            valorAcumulado = valorAcumulado + moeda.converter(); // Soma o valor convertido de cada moeda
        }
        
        return valorAcumulado; // retorna o valor da soma
		
    }
    
}
		
