package com.careerit.jfs.basics.movierating;

import java.util.List;

public class MovieRatingManager {
  public static void main(String[] args) {
    MovieRatingService movieRatingService = new MovieRatingServiceImpl();

    List<MovieStatDTO> list = movieRatingService.getMovieRatingStats();
    for (MovieStatDTO movieStatDTO : list) {
      System.out.println(movieStatDTO);
    }
  }
}
