package com.arcreane.repository;

import com.arcreane.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MemoryMovieRepository implements IMovieRepository {
    protected  List<Movie> movieList = new ArrayList<>();

    @Override
    public void AddMovie(Movie p_Movie){
        movieList.add(p_Movie);
        System.out.println("Movie " + p_Movie + " has been added ");
    }
}
