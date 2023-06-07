package biblioteca;
import java.util.ArrayList;
import java.util.List;

import manga.Manga;

public class Biblioteca {
    private List<Manga>mangas = new ArrayList<Manga>();
    
    public void addManga(Manga manga){
        mangas.add(manga);
    }

    public void removeManga(Manga manga){
        mangas.remove(manga);
    }

    public List<Manga> getMangas() {
        return mangas;
    }
}
