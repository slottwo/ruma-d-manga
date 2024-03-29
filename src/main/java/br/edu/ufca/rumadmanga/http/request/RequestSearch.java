package br.edu.ufca.rumadmanga.http.request;

public class RequestSearch extends RequestList {

    private String search;

    // Special Getters
    @Override
    public String getQuery() {
        return "q=" + getSearch();
    }

    // Getters
    public String getSearch() {
        return search;
    }

    // Setters
    public void setSearch(String search) throws Exception {
        if (search.length() > 2) {
            if (search.contains("&") | search.contains("=")) {
                throw new Exception("Well well well, if we don't have a hacker here.");
            }
            this.search = search.replace(' ', '+');
        } else {
            throw new Exception("The search must contain at least 3 characters.");
        }
    }
}
