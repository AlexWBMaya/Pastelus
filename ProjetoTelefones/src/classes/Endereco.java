/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Alek
 */
public class Endereco {
    //atributos
    String logradouro = "";
    int numero = 0;
    String complemento = "";
    int cep = 0;
    String cidadeestado = "";
    
    //métodos
    public Endereco(String logradouro, int numero, String complemento, int cep, String cidadeestado){
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cep = cep;
        this.cidadeestado = cidadeestado;
    }

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

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
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
        return "Endereco{" + "logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento + ", cep=" + cep + ", cidadeestado=" + cidadeestado + '}';
    }
    
    
    
}
