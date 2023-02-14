package com.careerit.jfs.basics.movierating;

import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MovieRatingUtil {

  public List<Movie> getMovies(Path path) throws IOException {
        List<String[]> list = readFromCSV(path,true);
        List<Movie> movieList = new ArrayList<>();
        for(String[] arr:list){
            Movie movie = Movie.builder()
                .movieId(Long.parseLong(arr[0]))
                .year(Integer.parseInt(arr[1]))
                .name(arr[2])
                .build();
            movieList.add(movie);
        }
        return movieList;
  }
  public List<Rating> getRatings(Path path) throws IOException {
    List<String[]> list = readFromCSV(path,true);
    List<Rating> ratings = new ArrayList<>();
    for(String[] arr:list){
          Rating rating = Rating.builder()
              .userId(Long.parseLong(arr[0]))
              .rating(Integer.parseInt(arr[1]))
              .movieId(Long.parseLong(arr[2]))
              .build();
          ratings.add(rating);
    }
    return ratings;
  }
  private List<String[]> readFromCSV(Path filePath, boolean hasHeader) throws IOException {
    List<String[]> list = new ArrayList<>();
    try (Reader reader = Files.newBufferedReader(filePath)) {
      try (CSVReader csvReader = new CSVReader(reader)) {
        String[] line;
        while ((line = csvReader.readNext()) != null) {
          list.add(line);
        }
      }
    }
    if (hasHeader) {
      return list.subList(1, list.size());
    }
    return list;
  }
}
