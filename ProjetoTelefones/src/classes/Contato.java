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
    public Contato(String nomeCompleto, String telefone, String email, String logradouro, int numero, String complemento, String cep, String cidadeestado) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.endereco = new Endereco(logradouro, numero, complemento, cep, cidadeestado);
    }

    // Sobrecarga do construtor para tratar strings
    public Contato(String nomeCompleto, String telefone, String email, String logradouro, String numero, String complemento, String cep, String cidadeestado) {
        this(nomeCompleto, telefone, email, logradouro, Integer.parseInt(numero), complemento, cep, cidadeestado);
    }

    // Getters e setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getLogradouro() {
        return endereco.getLogradouro();
    }

    public int getNumeroEndereco() {
        return endereco.getNumero();
    }

    public String getComplemento() {
        return endereco.getComplemento();
    }

    public String getCep() {
        return endereco.getCep();
    }

    public String getCidadeEstado() {
        return endereco.getCidadeestado();
    }

    @Override
    public String toString() {
        return nomeCompleto + ";" + telefone + ";" + email + ";" + endereco.toString();
    }
}
