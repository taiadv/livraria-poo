package Service;

import Model.Livro;
import Model.Cliente;

public class GerenciamentoDeVendas {

    public void realizarVenda(Cliente cliente, Livro livro) {
        System.out.println("Venda realizada:");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Preço: R$" + livro.calcularPreco());
    }
}
