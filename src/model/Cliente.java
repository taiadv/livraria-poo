package model;

// Cliente herda da classe Pessoa, ou seja, Cliente é uma Pessoa com características específicas
public class Cliente extends Pessoa {
    
    // Atributo privado para armazenar o email do cliente (encapsulamento)
    private String email;

    // Construtor para criar um objeto Cliente, chamando o construtor da superclasse Pessoa
    public Cliente(String nome, int idade, String email) {
        super(nome, idade);  // Chama construtor da classe Pessoa para nome e idade
        this.email = email;  // Inicializa o email do cliente
    }

    // Método getter para acessar o email do cliente
    public String getEmail() {
        return email;
    }

    // Método setter para modificar o email do cliente
    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString para representar o objeto Cliente como uma String amigável
    @Override
    public String toString() {
        // Retorna o nome, idade e email do cliente
        return getNome() + " (Idade: " + getIdade() + ", Email: " + email + ")";
    }
}
