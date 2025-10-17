package service;
// A classe está no pacote "service", que reúne funcionalidades relacionadas a serviços

import model.Livro;
import model.Cliente;
// Importa as classes Livro e Cliente do pacote model para poder usar aqui

public class GerenciamentoDeVendas {
    // Classe pública que gerencia vendas no sistema

    public void realizarVenda(Cliente cliente, Livro livro) {
        // Método público para realizar a venda, recebendo um cliente e um livro como parâmetros

        System.out.println("Venda realizada:");
        // Imprime uma mensagem informando que a venda foi feita

        System.out.println("Cliente: " + cliente.getNome());
        // Imprime o nome do cliente que comprou o livro

        System.out.println("Livro: " + livro.getTitulo());
        // Imprime o título do livro vendido

        System.out.println("Preço: R$" + livro.calcularPreco());
        // Imprime o preço do livro, usando o método calcularPreco da classe Livro
    }
}

