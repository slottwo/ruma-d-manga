package br.edu.ufca.rumadmanga.http.request;

public interface RequestListInterface {

    // Special Getters

    public String getQuery();

    // Getters

    public String getOffset();

    // Setters

    public void setOffset(Integer offset) throws Exception;
}
