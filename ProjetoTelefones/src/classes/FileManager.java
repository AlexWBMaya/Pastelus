/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alek
 */
public class FileManager {
    private static final Logger LOGGER = Logger.getLogger(FileManager.class.getName());
    private final String filePath;

    public FileManager(String filePath) {
        this.filePath = filePath;
    }

    public List<Contato> readFromFile() {
        List<Contato> contatos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 5) {
                    String nomeCompleto = parts[0];
                    Telefone telefone = new Telefone(parts[1], parts[2], parts[3]);
                    String email = parts[4];
                    contatos.add(new Contato(nomeCompleto, telefone, email));
                } else {
                    
                    LOGGER.warning("A linha não possui 5 partes: " + line);
                }
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao ler o arquivo: " + filePath, e);
        }
        return contatos;
    }

    public void writeToFile(Contato contato) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath, true), StandardCharsets.UTF_8))) {
            bw.write(contato.toString());
            bw.newLine();
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao escrever no arquivo: " + filePath, e);
        }
    }
}
