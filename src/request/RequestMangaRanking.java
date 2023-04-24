package request;

public class RequestMangaRanking extends RequestMangaList {
    private final String PATH = "manga/ranking";
    private Type type = Type.MANGA;

    @Override
    public String getQuery() {
        return "ranking_type=" + getType();
    }

    public String getType() {
        return type.getType();
    }

    public void setType(Type type) {
        this.type = type;
    }
}
