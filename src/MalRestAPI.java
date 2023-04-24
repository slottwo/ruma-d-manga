import java.io.File;
import java.util.Scanner;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class MalRestAPI {
    public static void main(String[] args) throws Exception {
        String CLIENT_ID;

        File file = new File("CLIENT-ID");
        try (Scanner reader = new Scanner(file)) {
            if (reader.hasNextLine()) {
                CLIENT_ID = reader.nextLine();
            } else {
                throw new Exception("CLIENT-ID file is empty");
            }
        }

        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https://api.myanimelist.net/v2/manga/0"))
                .header("X-MAL-CLIENT-ID", CLIENT_ID) // .GET()
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        
        HttpResponse<String> getResponse = httpClient.send(getRequest, BodyHandlers.ofString());

        System.out.println(getResponse.statusCode());
        System.out.println(getResponse.body());
    }
}