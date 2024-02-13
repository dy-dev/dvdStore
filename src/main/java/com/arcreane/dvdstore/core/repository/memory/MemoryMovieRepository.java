package com.arcreane.dvdstore.core.repository.memory;

import com.arcreane.dvdstore.core.entity.Movie;
import com.arcreane.dvdstore.core.repository.IMovieRepository;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class MemoryMovieRepository implements IMovieRepository {
    protected List<Movie> movieList = new ArrayList<>();

    @Override
    public void AddMovie(Movie p_Movie) {
        movieList.add(p_Movie);
        System.out.println("Movie " + p_Movie + " has been added ");
    }

    @Override
    public List<Movie> getAllMoviesInRepository() {
        return movieList;
    }

    @Override
    public Movie getMovieByName(String pMovieName) {
        return null;
    }
}
