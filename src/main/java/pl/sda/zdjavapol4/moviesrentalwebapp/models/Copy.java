package pl.sda.zdjavapol4.moviesrentalwebapp.models;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Copy {

    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    Movie movie;

    @Enumerated(EnumType.ORDINAL)
    CopyStatus copyStatus;

}

