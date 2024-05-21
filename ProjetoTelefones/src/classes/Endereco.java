package classes;

/**
 * Classe Endereco para armazenar informações de endereço.
 */
public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String cep;
    private String cidadeestado;

    // Construtor
    public Endereco(String logradouro, int numero, String complemento, String cep, String cidadeestado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidadeestado = cidadeestado;
    }

    // Getters e setters
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidadeestado() {
        return cidadeestado;
    }

    public void setCidadeestado(String cidadeestado) {
        this.cidadeestado = cidadeestado;
    }

    @Override
    public String toString() {
        return logradouro + ";" + numero + ";" + complemento + ";" + cep + ";" + cidadeestado;
    }
}
