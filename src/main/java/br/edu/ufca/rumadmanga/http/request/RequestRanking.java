package br.edu.ufca.rumadmanga.http.request;

public class RequestRanking extends RequestList {

    private String PATH = "manga/ranking";
    private Type type = Type.MANGA;

    @Override
    public String getQuery() {
        return "ranking_type=" + getType();
    }

    public String getPATH() {
        return PATH;
    }

    public String getType() {
        return type.getType();
    }

    public void setType(Type type) {
        this.type = type;
    }
}
