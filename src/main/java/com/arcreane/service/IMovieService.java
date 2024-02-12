package com.arcreane.service;

import com.arcreane.entity.Movie;
import com.arcreane.repository.IMovieRepository;

public interface IMovieService {
    void registerMovie(Movie p_Movie);
    void setRepository(IMovieRepository repository);
}
