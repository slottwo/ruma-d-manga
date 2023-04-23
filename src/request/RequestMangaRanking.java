package request;

public class RequestMangaRanking extends RequestMangaList {
    private final String PATH = "manga/ranking";
    private RankingType type = RankingType.MANGA;

    @Override
    public String getQuery() {
        return "ranking_type=" + getType();
    }

    public String getType() {
        return type.getType();
    }

    public void setType(RankingType type) {
        this.type = type;
    }
}
