package pl.sda.zdjavapol4.moviesrentalwebapp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "COPIES")

public class Copy {


    @Id
    @GeneratedValue
    Long copyID;

    @ManyToOne
    Movie movieID;

    @Enumerated(EnumType.ORDINAL)
    String copyStatus;

    public long getCopyID() {
        return copyID;
    }

    public void setCopyID(long copyID) {
        this.copyID = copyID;
    }

    public Movie getMovieID() {
        return movieID;
    }

    public void setMovieID(Movie movieID) {
        this.movieID = movieID;
    }

    public String getCopyStatus() {
        return copyStatus;
    }

    public void setCopyStatus(String copyStatus) {
        this.copyStatus = copyStatus;
    }
}

