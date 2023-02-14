package com.careerit.jfs.basics.movierating;


import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Rating {
  private long userId;
  private float rating;
  private long movieId;
}
