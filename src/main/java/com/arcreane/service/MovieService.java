package com.arcreane.service;

import com.arcreane.entity.Movie;
import com.arcreane.repository.MovieRepository;

public class MovieService {
    private static Integer refId = 0;
    protected MovieRepository movieRepository = new MovieRepository();
    public void registerMovie(Movie p_Movie)
    {
        p_Movie.setId(""+(refId++));
        movieRepository.AddMovie(p_Movie);
    }
}
