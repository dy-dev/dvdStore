package com.arcreane.dvdstore.core.service;

import com.arcreane.dvdstore.core.entity.Movie;
import com.arcreane.dvdstore.core.repository.IMovieRepository;

import java.util.List;

public interface IMovieService {
    void registerMovie(Movie p_Movie);
    void setRepository(IMovieRepository repository);
    List<Movie> getAllMovies();

    Movie getMovieByName(String pMovieName);

}
