/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alek
 */
public class FileManager implements interfaces.InterfaceICRUD{
    //Atributo
    private String filePath;
    
    //Métodos
    public FileManager(String filePath) {
        this.filePath = filePath;
    }

    public List<Contato> readFromFile() {
        List<Contato> contatos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 5) {
                    String nomeCompleto = parts[0];
                    String telefone = parts[1], parts[2], parts[3];
                    String email = parts[4];
                    contatos.add(new Contato(nomeCompleto, telefone, email));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contatos;
    }

    public void writeToFile(Contato contato) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            bw.write(contato.toString());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
