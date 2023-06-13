package br.edu.ufca.rumadmanga.http;

import br.edu.ufca.rumadmanga.http.request.Request;
import br.edu.ufca.rumadmanga.http.response.MangaList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
import java.net.*;

/**
 *
 * @author slottwo
 */
public class MalRestAPI {
    
    public static MangaList genMangaList() {
        
        return null;
    }

    public static StringBuffer connect(Request request) throws ClientIdException, Exception {
        // Get app authentification key
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

        // Connection Setup
        URL url = request.getURI().toURL();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Content-Type", "application/json");
        con.setRequestProperty("X-MAL-CLIENT-ID", CLIENT_ID);

        con.setConnectTimeout(5000);
        con.setReadTimeout(5000);

        // Setup Reader for Response
        int status = con.getResponseCode();

        Reader streamReader;

        if (status > 299) {
            streamReader = new InputStreamReader(con.getErrorStream());
        } else {
            streamReader = new InputStreamReader(con.getInputStream());
        }

        BufferedReader in = new BufferedReader(streamReader);
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }

        System.out.println(content);

        con.disconnect();

        return content;
    }

}
