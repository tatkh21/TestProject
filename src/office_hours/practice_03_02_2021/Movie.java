package office_hours.practice_03_02_2021;

public class Movie {
    /*
    Create a class Movie
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        name, genre, duration, release date, rating(G, PG, R, etc..), is a sequels or not, rotten tomatoes rating (out of 100), is on dvd.

    - Print out the Movie information using concatenations and print statements

    ------ Welcome to the Cinema ------

    Tonight we are streaming "$movieName" which was released on $releaseDate
    This $genre movie got a $rottenTomatoesRating rating on Rotten Tomatoes.
    The rating is $rating and it runs for $duration hours.
    This is a sequel $isSequel and is on dvd $isOnDvd.
     */
    public static void main (String[]args){
        String name = "BIG FOOT";
        String genre = "COMEDY";
        double duration = 1.29;
        double reliese = 01.26;
        int relieseYear = 2021;
        String rating = "PG";
        boolean isSequel = true;
        double rottenTomatoRating = 5.9;
        boolean isOnDvd = false;

        System.out.println("");
        System.out.println("*************WELCOME TO THE CINEMA**************");
        System.out.println("________________________________________________");
        System.out.println("TONIGHT WE ARE STREAMING \t\t\t" + name + "\"");
        System.out.println("________________________________________________");
        System.out.println("This " + genre + " got a " + rottenTomatoRating + " rating on Rotten Tomatoes.");
        System.out.println("The rating is " + rating + " and it runs for " + duration + " hours." );
        System.out.println ("This is a sequel - " + isSequel + " and is on DVD -  " + isOnDvd);
        System.out.println ("_______________________________________________");




    }
}
