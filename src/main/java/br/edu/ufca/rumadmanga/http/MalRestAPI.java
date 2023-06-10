package br.edu.ufca.rumadmanga.http;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author slottwo
 */
public class MalRestAPI {

    public static void main(String[] args) throws ClientIdException {
        String CLIENT_ID;

        File file = new File("src/main/resources/br/edu/ufca/rumadmanga/CLIENT-ID");
        try (Scanner reader = new Scanner(file)) {
            if (reader.hasNextLine()) {
                CLIENT_ID = reader.nextLine();
            } else {
                throw new ClientIdException("CLIENT-ID is empty.");
            }
        } catch (FileNotFoundException e) {
            throw new ClientIdException("CLIENT-ID not Found.");
        }
    }

}
