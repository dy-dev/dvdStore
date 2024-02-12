package com.arcreane.repository;

import com.arcreane.entity.Movie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersistantMovieRepository  implements IMovieRepository{
    String filePath = "I:\\Mon Drive\\Ecoles\\Ecole89\\23-24\\MasterJEE\\dvdStore\\movies.csv";
    @Override
    public void AddMovie(Movie p_Movie){
        try {
            FileWriter writer = new FileWriter(filePath,true );
            writer.write(p_Movie.toString());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
