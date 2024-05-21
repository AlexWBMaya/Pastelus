/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Alek
 */
public class Telefone {
    private String ddi;
    private String ddd;
    private String numero;

    public Telefone(String ddi, String ddd, String numero) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdi() {
        return ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
    
    @Override
    public String toString() {
        return ddi + " " + ddd + " " + numero;
    }
}
