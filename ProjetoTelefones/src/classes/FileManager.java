package classes;

import java.io.*;
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

    /**
     * Reads contacts from a file.
     * 
     * @return a list of Contato objects read from the file.
     */
    public static List<Contato> lerContatosDoArquivo(String filePath) {
        List<Contato> contatos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 8) {
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
                    LOGGER.warning("A linha não possui 8 partes: " + line);
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
     * @param filePath the file path.
     * @param contato  the Contato object to write to the file.
     */
    public static void escreverContatoEmArquivo(String filePath, Contato contato) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath, true), StandardCharsets.UTF_8))) {
            bw.write(contato.toString());
            bw.newLine();
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao escrever no arquivo: " + filePath, e);
        }
    }

    /**
     * Removes a contact from the file.
     * 
     * @param filePath     the file path.
     * @param nomeCompleto the full name of the contact to remove.
     */
    public static void removerContatoDoArquivo(String filePath, String nomeCompleto) {
        File inputFile = new File(filePath);
        File tempFile = new File(inputFile.getAbsolutePath() + ".tmp");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), StandardCharsets.UTF_8));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tempFile), StandardCharsets.UTF_8))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 8 && !parts[0].equalsIgnoreCase(nomeCompleto)) {
                    bw.write(line);
                    bw.newLine();
                }
            }

            if (!inputFile.delete()) {
                LOGGER.log(Level.SEVERE, "Could not delete original file: " + filePath);
                return;
            }

            if (!tempFile.renameTo(inputFile)) {
                LOGGER.log(Level.SEVERE, "Could not rename temp file to original file name: " + filePath);
            }

        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao remover contato do arquivo: " + filePath, e);
        }
    }
}
