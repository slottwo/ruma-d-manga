package request;

public enum RankingType {
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

    RankingType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
