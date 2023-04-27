package request;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.net.URI;
import java.net.URISyntaxException;

public abstract class Request implements RequestInterface {
    private final String API_URL = "https://api.myanimelist.net/v2/";
    private String PATH = "";
    private List<Field> fields = new ArrayList<>();

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

    // Setters

    public void setFields(ArrayList<Field> fields) {
        this.fields = fields;
    }

    public void setFields(Field[] fields) {
        this.fields = new ArrayList<Field>(Arrays.asList(fields));
    }

    public void addField(Field field) {
        this.fields.add(field);
    }

    // Getters

    public String getAPI_URL() {
        return API_URL;
    }

    public String getPATH() {
        return PATH;
    }

    public String getFields() {
        if (fields.isEmpty()) {
            return "";
        }

        List<String> fieldsStrings = new ArrayList<>();

        for (Field field : fields) {
            fieldsStrings.add(field.getType());
        }

        return "fields=" + String.join(",", fieldsStrings);
    }

    // Special Getters

    public abstract String getPathParameters();

    public abstract String getQueryParameters();
}