package com.careerit.jfs.basics.movierating;

import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Movie implements Serializable,Cloneable {
  private long movieId;
  private int year;
  private String name;
}
