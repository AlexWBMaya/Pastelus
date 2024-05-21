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
 * FileManager class to handle reading and writing Contato objects to a file.
 */
public class FileManager {
    private static final Logger LOGGER = Logger.getLogger(FileManager.class.getName());
    private final String filePath;

    public FileManager(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Reads contacts from a file.
     * 
     * @return a list of Contato objects read from the file.
     */
    public List<Contato> readFromFile() {
        List<Contato> contatos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 8) { // Correcting the parts length to 8
                    String nomeCompleto = parts[0];
                    String telefone = parts[1];
                    String email = parts[2];
                    String logradouro = parts[3];
                    String numero = parts[4];
                    String complemento = parts[5];
                    String cep = parts[6];
                    String cidadeestado = parts[7];
                    contatos.add(new Contato(nomeCompleto, telefone, email, logradouro, numero, complemento, cep, cidadeestado));
                } else {
                    LOGGER.warning("A linha não possui 8 partes: " + line); // Correcting the log message to 8 parts
                }
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao ler o arquivo: " + filePath, e);
        }
        return contatos;
    }

    /**
     * Writes a contact to a file.
     * 
     * @param contato the Contato object to write to the file.
     */
    public void writeToFile(Contato contato) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath, true), StandardCharsets.UTF_8))) {
            bw.write(contato.toString());
            bw.newLine();
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao escrever no arquivo: " + filePath, e);
        }
    }
}
