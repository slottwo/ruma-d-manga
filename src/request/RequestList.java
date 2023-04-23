package request;

import java.util.List;
import java.util.ArrayList;

public abstract class RequestList extends Request {
    private final String PATH = "manga";
    private Integer limit = 100;
    private Integer offset = 0;

    @Override
    public String toString() {
        return getAPI_URL() + getPathParameters() + getQueryParameters();
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

    public void setLimit(Integer limit) {
        if (0 < limit && limit < 100) {
            this.limit = limit;
        }
    }

    public void setOffset(Integer offset) {
        if (offset > 0) {
            this.offset = offset;
        }
    }
}