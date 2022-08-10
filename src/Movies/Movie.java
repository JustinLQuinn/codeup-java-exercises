package Movies;

public class Movie {
    private String name;
    private String category;

    // constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // accessors
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return name +"--" + category;
    }

    public static void main(String[] args) {

    }
}
