package pl.sda.zdjavapol4.moviesrentalwebapp.exceptions;

public class NoMovieInStockException extends Throwable{

    public NoMovieInStockException(String title) {
        super(title + " - Sorry, we don`t have avaible copy of that movie. Try again later.");
    }
}
