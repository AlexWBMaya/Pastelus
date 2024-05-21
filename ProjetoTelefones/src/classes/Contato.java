/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Alek
 */
public class Contato {
    private String nomeCompleto;
    private Telefone telefone;
    private String email;

    public Contato(String nomeCompleto, Telefone telefone, String email) {
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setTelefone(Telefone telefone) {
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
