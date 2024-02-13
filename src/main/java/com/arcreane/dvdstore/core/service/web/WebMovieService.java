package com.arcreane.dvdstore.core.service.web;

import com.arcreane.dvdstore.core.entity.Movie;
import com.arcreane.dvdstore.core.repository.IMovieRepository;
import com.arcreane.dvdstore.core.service.IMovieService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Movie> getAllMovies() {
        return repository.getAllMoviesInRepository();
    }

    @Override
    public Movie getMovieByName(String pMovieName) {
        return repository.getMovieByName(pMovieName);
    }
}
