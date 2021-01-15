package pl.sda.zdjavapol4.moviesrentalwebapp.model;

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
    Long copyId;

    public Copy(Long copyId) {
        this.copyId = copyId;
    }

    @ManyToOne
    Movie movieId;

    @Enumerated(EnumType.ORDINAL)
    CopyStatus copyStatus;

    public long getCopyId() {
        return copyId;
    }

    public void setCopyId(long copyID) {
        this.copyId = copyId;
    }

    public Movie getMovieId() {
        return movieId;
    }

    public void setMovieId(Movie movieId) {
        this.movieId = movieId;
    }

    public CopyStatus getCopyStatus() {
        return copyStatus;
    }

    public void setCopyStatus(CopyStatus copyStatus) {
        this.copyStatus = copyStatus;
    }
}

