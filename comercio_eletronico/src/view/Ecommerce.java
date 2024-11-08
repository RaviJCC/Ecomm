package view;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ecommerce {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        // Simulação de produtos no carrinho
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Smartphone", "Eletrônicos", "Smartphone de última geração", 1200.0, 2));
        produtos.add(new Produto(2, "Camiseta", "Roupas", "Camiseta masculina", 50.0, 3));

        NotaFiscal notaFiscal = new NotaFiscal(produtos);

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Ver Produtos");
            System.out.println("2. Realizar Pagamento");
            System.out.println("3. Cancelar Compra");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanf.nextInt();

            switch (opcao) {
                case 1:
                    // Exibe os produtos
                    System.out.println("=== Produtos ===");
                    for (Produto produto : produtos) {
                        System.out.println("ID: " + produto.getidProduto() + " | Nome: " + produto.getnome() +
                                " | Preço: R$" + produto.getpreco() + " | Quantidade: " + produto.getquantidade());
                    }
                    break;

                case 2:
                    // Opção para escolher o método de pagamento
                    System.out.println("=== Escolha o método de pagamento ===");
                    System.out.println("1. Cartão de Crédito");
                    System.out.println("2. Pix");
                    System.out.print("Escolha uma opção: ");
                    int metodoPagamento = scanf.nextInt();
                    scanf.nextLine(); // Consumir a linha em branco

                    if (metodoPagamento == 1) {
                        // Pagamento com cartão
                        System.out.println("=== Realizando Pagamento com Cartão ===");
                        System.out.print("Digite o ID do cartão: ");
                        int idCartao = scanf.nextInt();
                        scanf.nextLine(); // Para consumir a linha em branco
                        System.out.print("Digite o número do cartão: ");
                        String numeroCartao = scanf.nextLine();
                        System.out.print("Digite o nome do titular: ");
                        String nomeTitular = scanf.nextLine();
                        System.out.print("Digite a data de validade (MM/AAAA): ");
                        String dataValidade = scanf.nextLine();
                        System.out.print("Digite o CVV: ");
                        String cvv = scanf.nextLine();

                        Pagamento pagamentoCartao = new PagamentoCartao(idCartao, numeroCartao, nomeTitular, dataValidade, cvv);
                        // Realizando o pagamento
                        notaFiscal.realizarPagamento(pagamentoCartao);
                    } else if (metodoPagamento == 2) {
                        // Pagamento com Pix
                        System.out.println("=== Realizando Pagamento com Pix ===");
                        System.out.println("Digite o ID do pix: ");
                        int idPix = scanf.nextInt();
                        scanf.nextLine(); // consumir linha
                        System.out.println("Digite a chave Pix: ");
                        String chavePix = scanf.nextLine();
                        System.out.print("Digite o nome do comprador: ");
                        String nome = scanf.nextLine();
                        Pagamento pagamentoPix = new PagamentoPix(idPix, chavePix, nome);
                        // Realizando o pagamento
                        notaFiscal.realizarPagamento(pagamentoPix);
                    } else {
                        System.out.println("Opção inválida para método de pagamento.");
                    }
                    break;

                case 3:
                    System.out.println("Compra cancelada.");
                    // Limpar a lista de produtos, como se o carrinho tivesse sido "resetado"
                    produtos.clear();
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    scanf.close();
                    return;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}