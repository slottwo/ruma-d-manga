package request;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

public interface RequestInterface {

    public URI getURI() throws URISyntaxException;

    // Setters

    public void setFields(ArrayList<Field> fields);

    public void setFields(Field[] fields);

    public void addField(Field field);

    // Getters

    public String getAPI_URL();

    public String getPATH();

    public String getFields();

    // Special Getters

    public String getPathParameters();

    public String getQueryParameters();

}
