package br.edu.ufca.rumadmanga.http.request;

public enum Field {
    id("id"),
    title("title"),
    main_picture("main_picture"),
    alternative_titles("alternative_titles"),
    start_date("start_date"),
    end_date("end_date"),
    synopsis("synopsis"),
    mean("mean"),
    rank("rank"),
    popularity("popularity"),
    num_list_users("num_list_users"),
    num_scoring_users("num_scoring_users"),
    nsfw("nsfw"),
    created_at("created_at"),
    updated_at("updated_at"),
    media_type("media_type"),
    status("status"),
    genres("genres"),
    my_list_status("my_list_status"),
    num_episodes("num_episodes"),
    start_season("start_season"),
    broadcast("broadcast"),
    source("source"),
    average_episode_duration("average_episode_duration"),
    rating("rating"),
    pictures("pictures"),
    background("background"),
    related_anime("related_anime"),
    related_manga("related_manga"),
    recommendations("recommendations"),
    studios("studios"),
    statistics("statistics");

    private String type;

    Field(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return getType();
    }

    public String[] getAll() {
        String[] types = new String[Field.values().length];
        for (int i = 0; i < Field.values().length; i++) {
            types[i] = Field.values()[i].getType();
        }
        return types;
    }
}
