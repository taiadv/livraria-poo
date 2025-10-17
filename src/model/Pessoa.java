package model;

// Classe abstrata que representa uma Pessoa com nome e idade
public abstract class Pessoa {
    private String nome;  // nome da pessoa
    private int idade;    // idade da pessoa

    // Construtor para inicializar nome e idade
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para a idade
    public int getIdade() {
        return idade;
    }

    // Setter para a idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
