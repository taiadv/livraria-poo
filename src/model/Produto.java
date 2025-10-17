package model;

/**
 * Classe abstrata que representa um produto genérico da livraria.
 * Serve como base para produtos como livros e outros materiais vendáveis.
 */
public abstract class Produto {
    // Título do produto
    private String titulo;
    
    // Preço do produto
    private double preco;

    /**
     * Construtor da classe Produto.
     * @param titulo Título do produto
     * @param preco Preço do produto
     */
    public Produto(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    // Getter para o título
    public String getTitulo() {
        return titulo;
    }

    // Setter para o título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para o preço
    public double getPreco() {
        return preco;
    }

    // Setter para o preço
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Método abstrato que deve ser implementado por subclasses
     * para calcular o preço final do produto.
     */
    public abstract double calcularPreco();
}
