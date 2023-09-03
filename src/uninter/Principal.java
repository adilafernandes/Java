package uninter; //pacote com as classes do projeto

import java.util.Scanner; // Importação da classe Scanner para leitura de entrada do usuário

public class Principal { //// Classe Principal que contém o método principal (main)

    private static Scanner sc; // Scanner para ler a entrada do usuário
    private static Cofrinho cofrinho; // Instância do objeto Cofrinho para armazenar as moedas

    public static void main(String[] args) {
        sc = new Scanner(System.in); // Inicializa o Scanner para ler a entrada do usuário
        cofrinho = new Cofrinho(); // Inicializa o objeto Cofrinho para armazenar as moedas
        exibirMenu(); // Chama o método para exibir o menu
    }

    //Método para exibir o menu
    public static void exibirMenu() {
        System.out.println("COFRINHO");
        System.out.println("1- Adicionar moeda:");
        System.out.println("2- Remover moeda:");
        System.out.println("3- Listar moeda:");
        System.out.println("4- Calcular valor total convertido para real:");
        System.out.println("5- Encerrar");

        String opcaoSelecionada = sc.next(); // Lê a opção selecionada pelo usuário

        switch (opcaoSelecionada) { //Seleciona a opção com base na entrada do usuário
        case "5": // Se a opção selecionada for 5, encerra o sistema
            System.out.println("Sistema Encerrado");
            break; // Encerra o case

        case "1": // Se a opção selecionada for 1, permite escolher a moeda e adicionar ao cofrinho
            System.out.println("Escolha Moeda");
            System.out.println("1- Real:");
            System.out.println("2- Dólar:");
            System.out.println("3- Euro:");

            int opcaoMoeda = sc.nextInt(); // Lê a opção de moeda selecionada pelo usuário

            if (opcaoMoeda == 1 || opcaoMoeda == 2 || opcaoMoeda == 3) { // Verifica se a opção de moeda selecionada é válida
                System.out.println("Digite o valor:");
                double valorMoeda = sc.nextDouble(); // Lê o valor da moeda digitado pelo usuário

                Moeda moeda; //Declaração da variável moeda para armazenar a instância da moeda selecionada

                if (opcaoMoeda == 1) { //// Se a opção de moeda selecionada for 1 
                    moeda = new Real(valorMoeda); // Cria uma instância da classe Real com o valor informado
                    cofrinho.adicionar(moeda); // Adiciona a moeda ao cofrinho
                    System.out.println("Moeda de Real adicionada com sucesso");
                } else if (opcaoMoeda == 2) { // Se a opção de moeda selecionada for 2
                    moeda = new Dolar(valorMoeda); // Cria uma instância da classe Dolar com o valor informado
                    cofrinho.adicionar(moeda); // Adiciona a moeda ao cofrinho
                    System.out.println("Moeda de Dolar adicionada com sucesso");
                } else if (opcaoMoeda == 3) { // Se a opção de moeda selecionada for 3
                    moeda = new Euro(valorMoeda); // Cria uma instância da classe Euro com o valor informado
                    cofrinho.adicionar(moeda); // Adiciona a moeda ao cofrinho
                    System.out.println("Moeda de Euro adicionada com sucesso");
                }

                System.out.println(); // Adiciona uma linha em branco antes de exibir o menu novamente
                exibirMenu(); // Chama o método para exibir o menu novamente
            } else { // Se a opção selecionada não for válida
                System.out.println("Opção inválida. Digite um número válido.");
                exibirMenu(); // Chama o método para exibir o menu novamente
            }
            break;//Encerra o case

        case "2": // Se a opção selecionada for 2, permite escolher a moeda e remover do cofrinho
            System.out.println("Escolha Moeda");
            System.out.println("1- Real:");
            System.out.println("2- Dólar:");
            System.out.println("3- Euro:");

            int opcaoMoedaRemovida = sc.nextInt(); // Lê a opção de moeda selecionada pelo usuário

            System.out.println("Digite o valor :"); //exibe a mensagem

            double valorMoedaRemovida = sc.nextDouble(); // Lê o valor da moeda digitado pelo usuário

            Moeda moeda = null; //// Declaração da variável moeda, inicializada com o valor nulo

            if (opcaoMoedaRemovida == 1) { //// Se a opção de moeda selecionada para remoção for 1
                moeda = new Real(valorMoedaRemovida); // Cria uma instância da classe Real com o valor informado
            } else if (opcaoMoedaRemovida == 2) { // // Se a opção de moeda selecionada para remoção for 2
                moeda = new Dolar(valorMoedaRemovida); // Cria uma instância da classe Dolar com o valor informado
            } else if (opcaoMoedaRemovida == 3) { //// Se a opção de moeda selecionada para remoção for 3
                moeda = new Euro(valorMoedaRemovida); // Cria uma instância da classe Euro com o valor informado
            }

            if (moeda != null) { // Verifica se a moeda não é nula
                boolean moedaRemovida = cofrinho.remover(moeda); // Remove a moeda do cofrinho
                if (moedaRemovida) { // Se a moeda foi removida 
                    System.out.println("Moeda removida com sucesso"); 
                } else { // Se a moeda não for removida
                    System.out.println("Moeda não encontrada no cofrinho."); 
                }
            }

            System.out.println(); // Adiciona uma linha em branco antes de exibir o menu novamente
            exibirMenu(); // Chama o método para exibir o menu novamente
            break; //encerra a case

        case "3": // Se a opção selecionada for 3, lista todas as moedas armazenadas no cofrinho
            cofrinho.listagemMoedas(); // Exibe a lista de moedas armazenadas no cofrinho
            System.out.println(); // Adiciona uma linha em branco antes de exibir o menu novamente
            exibirMenu(); // Chama o método para exibir o menu novamente
            break; //encerra a case

        case "4": // Se a opção selecionada for 4, calcula o valor total convertido para reais
            double valorTotalConvertido = cofrinho.totalConvertido(); // Calcula o valor total convertido para reais
            System.out.println("Total Convertido para Real: " + valorTotalConvertido); //exibe a mensagem com o valor convertido
            System.out.println(); // Adiciona uma linha em branco antes de exibir o menu novamente
            exibirMenu(); // Chama o método para exibir o menu novamente
            break; //enccerra a case

        default: // Se a opção selecionada não for válida
            System.out.println("Opção inválida.");
            System.out.println(); // Adiciona uma linha em branco antes de exibir menu novamente 
            exibirMenu(); // Chama o método para exibir o menu novamente
            break; //encera a case
    }

    }
}
       
        



	
		
