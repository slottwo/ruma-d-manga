import java.io.File;
import java.util.Scanner;

import request.RequestMangaRanking;
import request.Type;

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

        RequestMangaRanking getTop10Manhwas = new RequestMangaRanking();
        getTop10Manhwas.setType(Type.MANHWA);
        getTop10Manhwas.setLimit(10);
        System.out.println(getTop10Manhwas);

        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(getTop10Manhwas.getURI())
                .header("X-MAL-CLIENT-ID", CLIENT_ID) // .GET()
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpResponse<String> getResponse = httpClient.send(getRequest, BodyHandlers.ofString());

        System.out.println(getResponse.statusCode());
        System.out.println(getResponse.body());
    }
}
