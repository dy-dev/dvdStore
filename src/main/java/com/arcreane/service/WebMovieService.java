package com.arcreane.service;

import com.arcreane.entity.Movie;
import com.arcreane.repository.IMovieRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class WebMovieService implements IMovieService{
    @Autowired
    private IMovieRepository repository;
    private String prefix = "Num_";
    private Integer id = 125;
    @Override
    public void registerMovie(Movie p_Movie) {
        p_Movie.setId(prefix+(id++));
        repository.AddMovie(p_Movie);
    }
}
