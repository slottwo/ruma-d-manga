package br.edu.ufca.rumadmanga.http.request;

import java.util.List;
import java.util.ArrayList;

import java.net.URI;
import java.net.URISyntaxException;

public abstract class RequestList extends Request implements RequestListInterface {

    private String PATH = "manga";
    private Integer limit = 100;
    private Integer offset = 0;

    @Override
    public String toString() {
        try {
            return "Request: <" + getURI() + ">";
        } catch (URISyntaxException exception) {
            exception.printStackTrace();
        }
        return "Request: <>";
    }

    public URI getURI() throws URISyntaxException {
        return new URI(getAPI_URL() + getPathParameters() + getQueryParameters());
    }

    // Special Getters
    @Override
    public String getPathParameters() {
        return getPATH();
    }

    @Override
    public String getQueryParameters() {
        List<String> parameters = new ArrayList<>();
        parameters.add(getQuery());

        if (getLimit() != "") {
            parameters.add(getLimit());
        }
        if (getOffset() != "") {
            parameters.add(getOffset());
        }
        if (getFields() != "") {
            parameters.add(getFields());
        }

        return "?" + String.join("&", parameters);
    }

    public abstract String getQuery();

    // Getters
    public String getPATH() {
        return PATH;
    }

    public String getLimit() {
        return (limit != 100) ? "limit=" + limit : "";
    }

    public String getOffset() {
        return (offset != 0) ? "offset=" + offset : "";
    }

    // Setters
    public void setLimit(Integer limit) throws Exception {
        if (0 < limit && limit <= 100) {
            this.limit = limit;
        } else {
            throw new Exception("Limit must be in (0,100].");
        }
    }

    public void setOffset(Integer offset) throws Exception {
        if (offset >= 0) {
            this.offset = offset;
        } else {
            throw new Exception("Offset must be non-negative.");
        }
    }
}
