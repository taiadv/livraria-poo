package Model;

public class Cliente extends Pessoa {
    private String email;

    public Cliente(String nome, int idade, String email) {
        super(nome, idade);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return getNome() + " (Idade: " + getIdade() + ", Email: " + email + ")";
    }
}
