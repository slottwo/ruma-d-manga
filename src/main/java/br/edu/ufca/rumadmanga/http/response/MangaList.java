/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufca.rumadmanga.http.response;

import java.net.URI;
import java.util.List;
import br.edu.ufca.rumadmanga.manga.Manga;

/**
 *
 * @author slottwo
 */
public class MangaList {

    private List<Manga> data;
    private URI previous;
    private URI next;

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
