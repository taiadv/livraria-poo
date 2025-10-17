package model;

import java.util.List;
import interfaces.Vendavel;

// A classe Livro herda de Produto e implementa a interface Vendavel
public class Livro extends Produto implements Vendavel {

    // Lista de autores que escreveram o livro (relação de associação - muitos autores)
    private List<Autor> autores;

    // Editora que publicou o livro (relação de composição - um livro tem uma editora)
    private Editora editora;

    // Construtor para inicializar o título, preço, autores e editora do livro
    public Livro(String titulo, double preco, List<Autor> autores, Editora editora) {
        super(titulo, preco);  // chama o construtor da classe Produto para título e preço
        this.autores = autores;
        this.editora = editora;
    }

    // Getter para obter a lista de autores
    public List<Autor> getAutores() {
        return autores;
    }

    // Setter para modificar a lista de autores
    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    // Getter para obter a editora
    public Editora getEditora() {
        return editora;
    }

    // Setter para modificar a editora
    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    // Implementação do método calcularPreco da interface Vendavel
    // Aqui apenas retorna o preço do livro armazenado na classe Produto
    @Override
    public double calcularPreco() {
        return getPreco();
    }

    // Método toString para representar o livro de forma legível
    @Override
    public String toString() {
        // Mostra título, preço formatado, nome da editora e nomes dos autores
        return "Livro: " + getTitulo() + " | Preço: R$" + calcularPreco() +
               " | Editora: " + editora.getNome() +
               " | Autores: " + autores.stream().map(Autor::getNome).toList();
    }
}
