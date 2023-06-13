package br.edu.ufca.rumadmanga.http.request;

public enum Type {
    ALL("all"),
    MANGA("manga"),
    NOVELS("novels"),
    ONESHOTS("oneshots"),
    DOUJIN("doujin"),
    MANHWA("manhwa"),
    MANHUA("manhua"),
    BYPOPULARITY("bypopularity"),
    FAVORITE("favorite");

    private String type;

    Type(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
