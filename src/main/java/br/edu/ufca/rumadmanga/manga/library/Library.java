/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufca.rumadmanga.manga.library;

import br.edu.ufca.rumadmanga.manga.Manga;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author slottwo
 */
public class Library {

    private List<Manga> mangas = new ArrayList<Manga>();

    public void addManga(Manga manga) {
        mangas.add(manga);
    }

    public void removeManga(Manga manga) {
        mangas.remove(manga);
    }

    public List<Manga> getMangas() {
        return mangas;
    }
}
