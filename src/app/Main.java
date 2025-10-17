package app;

import java.util.List;

import model.Autor;
import model.Editora;
import model.Livro;
import service.CadastroDeLivros;
import model.Cliente;
import service.GerenciamentoDeVendas;
// import service.Cliente; // Removed because it cannot be resolved

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criar autores
        Autor autor1 = new Autor("Machado de Assis", 60, "Brasileiro");
        Autor autor2 = new Autor("Clarice Lispector", 56, "Brasileira");

        // Criar editora
        Editora editora = new Editora("Editora Moderna", "12.345.678/0001-90");

        // Criar lista de autores
        List<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);

        // Criar livro
        Livro livro = new Livro("Dom Casmurro", 50.0, autores, editora);

        // Cadastro de livros
        CadastroDeLivros cadastro = new CadastroDeLivros();
        cadastro.adicionarLivro(livro);

        // Criar cliente
        Cliente cliente = new Cliente("João Silva", 30, "joao.silva@email.com");

        // Gerenciamento de vendas
        GerenciamentoDeVendas vendas = new GerenciamentoDeVendas();
        vendas.realizarVenda(cliente, livro);

        // Listar livros cadastrados
        System.out.println("\nLivros cadastrados:");
        for (Livro l : cadastro.listarLivros()) {
            System.out.println(l);
        }
    }
}
