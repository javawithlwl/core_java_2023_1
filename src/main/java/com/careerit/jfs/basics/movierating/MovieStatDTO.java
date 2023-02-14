package com.careerit.jfs.basics.movierating;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class MovieStatDTO {

    private long movieId;
    private String name;
    private float avgRating;
    private int count;
}
