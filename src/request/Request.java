package request;

public abstract class Request {
    private final String API_URL = "https://api.myanimelist.net/v2/";
    private final String PATH = "";
    private String[] fields = null;    

    @Override
    public String toString() {
        return getAPI_URL() + getPATH() + getPathParameters() + getQueryParameters();
    }

    // Setters

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    // Getters

    public String getAPI_URL() {
        return API_URL;
    }

    public String getPATH() {
        return PATH;
    }

    public String getFields() {
        return (fields != null) ? "fields=" + String.join(",", fields) : "";
    }

    // Special Getters

    public abstract String getPathParameters()  ;

    public abstract String getQueryParameters();
}