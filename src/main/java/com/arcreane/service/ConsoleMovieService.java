package com.arcreane.service;

import com.arcreane.entity.Movie;
import com.arcreane.repository.IMovieRepository;
import lombok.Data;

@Data
public class ConsoleMovieService implements IMovieService{
    private static Integer refId = 0;
    protected IMovieRepository repository;
    @Override
    public void registerMovie(Movie p_Movie)
    {
        p_Movie.setId(""+(refId++));
        repository.AddMovie(p_Movie);
    }
}
