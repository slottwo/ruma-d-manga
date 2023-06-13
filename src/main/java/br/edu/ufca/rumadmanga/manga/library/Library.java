/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufca.rumadmanga.manga.library;

import br.edu.ufca.rumadmanga.manga.Manga;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author slottwo
 */
public class Library {

    private HashMap<Integer, Manga> mangas = new HashMap<>();

    public boolean addManga(Manga manga) {
        if (mangas.containsKey(manga.getId())) {
            mangas.put(manga.getId(), manga);
            return true;
        }
        return false;
    }

    public boolean removeManga(Manga manga) {
        if (mangas.containsKey(manga.getId())) {
            mangas.remove(manga.getId(), manga);
            return true;
        }
        return false;
    }

    public Manga getManga(int id) {
        if (mangas.containsKey(id)) {
            return mangas.get(id);
        }
        return null;
    }

    public Collection<Manga> getMangas() {
        return mangas.values();
    }
}
