package Movies;

import util.Input;

public class MoviesApplication {
    public static final int INVALID_CHOICE = -1;
    public static final int EXIT_CHOICE = 0;
    private static Movie [] movies;

    public static void main(String[] args) {
        //grab al the movies
        movies = MoviesArray.findAll();

        Input input = new Input();

        // loop until the user says he/she does not wish to continue
        int choice = INVALID_CHOICE;
        while(choice != EXIT_CHOICE) {
            printMenu();

            choice = input.getInt(0, 5);

            doChoice(choice);

        }
    }

    private static void printMenu() {
        System.out.print("""
                What would you like to do?
                                
                0 - exit
                1 - view all movies
                2 - view movies in the animated category
                3 - view movies in the drama category
                4 - view movies in the horror category
                5 - view movies in the scifi category
                            
                Enter your choice: """);
    }

    private static void doChoice(int choice) {
        // TODO: call your functions based on whatever the user's choice is
        switch(choice) {
            case 1:
//              printAllMovies();
                printMoviesByCategory("all");
                break;
            case 2:
//              printAnimatedMovie();
                printMoviesByCategory("animated");
                break;
            case 3:
                printMoviesByCategory("drama");
                break;
            case 4:
                printMoviesByCategory("horror");
                break;
            case 5:
                printMoviesByCategory("sci-fi");
                break;
        }
    }

    private static void printMoviesByCategory(String category) {
        for(Movie movie: movies){
            if(movie.getCategory().equals(category) || category.equals("all")){
                System.out.println(movie);
            }
        }
    }

//    private static void printAnimatedMovie() {
//       for(Movies movie: movies){
//            if(movie.getCategory().equals(category)){
//                System.out.println(movie);
//            }
//        }
//    }

//    private static void printAllMovies() {
//        //loop through movies and print out
//        for (Movie movie: movies) {
//            System.out.println(movie);
//        }
//    }

}