package com.careerit.jfs.basics.movierating;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MovieRatingServiceImpl implements MovieRatingService {

  private MovieRatingUtil movieRatingUtil;

  public MovieRatingServiceImpl() {
    movieRatingUtil = new MovieRatingUtil();
  }

  @Override
  public List<MovieStatDTO> getMovieRatingStats() {
    List<MovieStatDTO> list = new ArrayList<>();
    try {
      List<Movie> movies = movieRatingUtil
          .getMovies(new File(this.getClass().getResource("/movie_data.csv").getFile()).toPath());
      List<Rating> ratings = movieRatingUtil.getRatings(new File(this.getClass().getResource("/rating.csv").getFile()).toPath());

      for (Movie movie : movies) {
        String name = movie.getName();
        long movieId = movie.getMovieId();
        int count = 0;
        float ratingSum = 0;
        for (Rating rating : ratings) {
          if (rating.getMovieId() == movieId) {
            count++;
            ratingSum += rating.getRating();
          }
        }
        float avgRating = ratingSum / count;
        MovieStatDTO obj = MovieStatDTO.builder()
            .movieId(movieId)
            .name(name)
            .avgRating(avgRating)
            .count(count)
            .build();
        list.add(obj);
      }


    } catch (IOException e) {
      System.out.println(e);
    }
    return list;
  }

  public static void main(String[] args) {
    new MovieRatingServiceImpl().getMovieRatingStats();
  }
}
