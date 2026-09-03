package EntradaSaidaDeDados;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Entrada de Dados a partir do Console
        Scanner scanner = new Scanner(System.in);

        // Cabeçalho
        System.out.println("=============================");
        System.out.println("    CADASTRO DE PRODUTOS");
        System.out.println("=============================");
        System.out.println(" ");

        // Inserção de Dados
        System.out.print("Digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite seu CPF: ");
        String cpfCliente = scanner.nextLine();
        System.out.println(" ");

        System.out.print("Digite o nome do Produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Valor do Produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a QTD.: ");
        int qtdProduto = scanner.nextInt();
        System.out.println(" ");

        // Somar Total
        double valorTotal = valorProduto * qtdProduto;

        // Impressão dos Dados
        System.out.println(" RESUMO DO PEDIDO");
        System.out.println("------------------------------------");

        System.out.println("Nome: " + nomeCliente );
        System.out.println("CPF: " + cpfCliente);
        System.out.println(" ");

        System.out.println("Produto: " + nomeProduto);
        System.out.println("QTD.: " + qtdProduto);
        System.out.println(" ");
        System.out.println("Valor total: " + valorTotal);
        System.out.println(" ");

        System.out.println("---------------------------------------------------");
        System.out.println("Obrigado por comprar conosco! Volte Sempre!");
        System.out.println("===================================================");

        scanner.close(); // Boa prática: fechar o scanner ao finalizar
    }
}