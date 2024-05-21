/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import classes.Contato;
import java.util.List;

/**
 *
 * @author Alek
 */
public interface InterfaceICRUD {
    List<Contato> readFromFile();
    void writeToFile(Contato contato);
}
