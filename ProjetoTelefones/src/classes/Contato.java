/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.lang.String;

/**
 *
 * @author Alek
 */
public class Contato {
    private String nomeCompleto;
    private String telefone;
    private String email;

    public Contato(String nomeCompleto, String telefone, String email, String logradouro, int numero, String complemento, int cep, String cidadeestado) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        classes.Endereco endereco = new classes.Endereco(logradouro, numero, complemento, cep, cidadeestado);
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
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

    
    
    @Override
    public String toString() {
        return nomeCompleto + ";" + telefone.toString() + ";" + email;
    }
}
