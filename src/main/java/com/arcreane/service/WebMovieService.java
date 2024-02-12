package com.arcreane.service;

import com.arcreane.entity.Movie;
import com.arcreane.repository.IMovieRepository;
import lombok.Data;

@Data
public class WebMovieService implements IMovieService{
    private IMovieRepository repository;
    private String prefix = "Num_";
    private Integer id = 125;
    @Override
    public void registerMovie(Movie p_Movie) {
        p_Movie.setId(prefix+(id++));
        repository.AddMovie(p_Movie);
    }
}
