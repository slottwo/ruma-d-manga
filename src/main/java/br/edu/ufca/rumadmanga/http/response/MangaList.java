/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufca.rumadmanga.http.response;

import java.net.URI;
import java.util.List;
import br.edu.ufca.rumadmanga.manga.Manga;
import java.net.URISyntaxException;
import java.util.Arrays;

/**
 *
 * @author slottwo
 */
public class MangaList {

    private List<Manga> data;
    private URI previous;
    private URI next;

    public MangaList(StringBuffer s) throws URISyntaxException {
        int i, j;

        String dataString = s.substring(s.indexOf("[") + 1, s.indexOf("]"));
        String[] nodes = dataString.split("node");

        for (String node : nodes) {
            System.out.println(node);
            i = node.indexOf("\"title\":\"");
            j = node.indexOf("\"", i + 9);
            String title = node.substring(i, j);
            System.out.println(title);
        }
        String nextString = s.substring(s.lastIndexOf("\"next\":\"") + 8, s.lastIndexOf("\"}}"));
        next = new URI(nextString);

    }

    public List<Manga> getData() {
        return data;
    }

    public void setData(List<Manga> data) {
        this.data = data;
    }

    public URI getPrevious() {
        return previous;
    }

    public void setPrevious(URI previous) {
        this.previous = previous;
    }

    public URI getNext() {
        return next;
    }

    public void setNext(URI next) {
        this.next = next;
    }
}
