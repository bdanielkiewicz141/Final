package pl.sda.zdjavapol4.moviesrentalwebapp.exceptions;

public class MovieAlreadyExistsException extends Throwable{

    public MovieAlreadyExistsException(String title) {
        super(title + " - That movie already exists in our Library.");
    }
}
