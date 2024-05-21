package classes;

/**
 * Classe Contato para armazenar informações de contato e endereço.
 */
public class Contato {
    private String nomeCompleto;
    private String telefone;
    private String email;
    private Endereco endereco;

    // Construtor principal com todos os campos
    public Contato(String nomeCompleto, String telefone, String email, String logradouro, int numero, String complemento, int cep, String cidadeestado) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.endereco = new Endereco(logradouro, numero, complemento, cep, cidadeestado);
    }

    // Sobrecarga do construtor para tratar strings
    public Contato(String nomeCompleto, String telefone, String email, String logradouro, String numero, String complemento, String cep, String cidadeestado) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.endereco = new Endereco(logradouro, Integer.parseInt(numero), complemento, Integer.parseInt(cep), cidadeestado);
    }

    // Getters e setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return nomeCompleto + ";" + telefone + ";" + email + ";" + endereco.toString();
    }
}
