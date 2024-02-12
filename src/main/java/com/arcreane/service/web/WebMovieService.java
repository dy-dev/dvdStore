package com.arcreane.service.web;

import com.arcreane.entity.Movie;
import com.arcreane.repository.IMovieRepository;
import com.arcreane.service.IMovieService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Data
@Service
public class WebMovieService implements IMovieService {
    @Autowired
    private IMovieRepository repository;
    @Value("${service.prefix}")
    private String prefix = "Num_";
    @Value("${service.id}")
    private Integer id;
    @Override
    public void registerMovie(Movie p_Movie) {
        p_Movie.setId(prefix+(id++));
        repository.AddMovie(p_Movie);
    }
}
