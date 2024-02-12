package com.arcreane.repository.persistant;

import com.arcreane.entity.Movie;
import com.arcreane.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Repository
public class PersistantMovieRepository  implements IMovieRepository {
    @Value("${movie.file.location}")
    String filePath;
    @Override
    public void AddMovie(Movie p_Movie){
        try {
            String fp = "I:\\Mon Drive\\Ecoles\\Ecole89\\23-24\\MasterJEE\\dvdStore\\movies.csv";
            FileWriter writer = new FileWriter(filePath,true );
            writer.write(p_Movie.toString());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
