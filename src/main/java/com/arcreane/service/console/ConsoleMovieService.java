package com.arcreane.service.console;

import com.arcreane.entity.Movie;
import com.arcreane.repository.IMovieRepository;
import com.arcreane.service.IMovieService;
import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class ConsoleMovieService implements IMovieService {
    private static Integer refId = 0;
    protected IMovieRepository repository;
    @Override
    public void registerMovie(Movie p_Movie)
    {
        p_Movie.setId(""+(refId++));
        repository.AddMovie(p_Movie);
    }
}
