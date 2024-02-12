package com.arcreane.service.console;

import com.arcreane.entity.Movie;
import com.arcreane.repository.IMovieRepository;
import com.arcreane.service.IMovieService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Data
//@Service
public class ConsoleMovieService implements IMovieService {

    @Autowired
    protected IMovieRepository repository;

    @Value("${service.id}")
    private Integer id;

    @Override
    public void registerMovie(Movie p_Movie)
    {
        p_Movie.setId(""+(id++));
        repository.AddMovie(p_Movie);
    }
}
