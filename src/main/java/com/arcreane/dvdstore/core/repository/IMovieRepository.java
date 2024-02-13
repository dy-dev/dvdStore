package com.arcreane.dvdstore.core.repository;

import com.arcreane.dvdstore.core.entity.Movie;

import java.util.List;

public interface IMovieRepository {
    void AddMovie(Movie p_Movie);

    List<Movie> getAllMoviesInRepository();

    Movie getMovieByName(String pMovieName);
}
