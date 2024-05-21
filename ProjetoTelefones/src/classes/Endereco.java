package classes;

/**
 * Endereco class to store address details.
 */
public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String cep;
    private String cidadeestado;

    public Endereco(String logradouro, int numero, String complemento, String cep, String cidadeestado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidadeestado = cidadeestado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    public String getCidadeestado() {
        return cidadeestado;
    }

    @Override
    public String toString() {
        return logradouro + ";" + numero + ";" + complemento + ";" + cep + ";" + cidadeestado;
    }
}
