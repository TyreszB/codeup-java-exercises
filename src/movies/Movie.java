package movies;

public class Movie {
    private String name;


    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory() {
        this.category = category;
    }

    private String category;
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

}
