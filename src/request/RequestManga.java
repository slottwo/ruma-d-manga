package request;

public class RequestManga extends Request {
    private final String PATH = "manga";
    private Integer id;

    public String getId() {
        return id.toString();
    }

    public void setId(Integer manga_id) throws Exception {
        if (id > 0) {
            this.id = manga_id;
        } else {
            throw new Exception("manga_id must be greater than zero.");
        }
    }

    @Override
    public String getPathParameters() {
        return getPATH() + "/" + id;
    }

    @Override
    public String getQueryParameters() {
        if (getFields() != "") {
            return "?" + getFields();
        }
        return "";
    }
}
