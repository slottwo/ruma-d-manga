package br.edu.ufca.rumadmanga.http;

import br.edu.ufca.rumadmanga.http.request.Request;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.net.*;

/**
 *
 * @author slottwo
 */
public class MalRestAPI {

    public static void main(Request request) throws ClientIdException, Exception {
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
        
        URL url = request.getURI().toURL();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestMethod("GET");
        Authenticator auth = new Authenticator()
        con.setAuthenticator(auth);
    }

}
