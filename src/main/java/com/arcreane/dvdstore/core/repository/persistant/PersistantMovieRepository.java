package com.arcreane.dvdstore.core.repository.persistant;

import com.arcreane.dvdstore.core.entity.Movie;
import com.arcreane.dvdstore.core.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PersistantMovieRepository  implements IMovieRepository {

//    @Value("${movie.file.location}")
    @Value("${movie.file.location}")
    String filePath;
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

    @Override
    public List<Movie> getAllMoviesInRepository() {
        List<Movie> toReturn = new ArrayList<>();
        try {
            String fp = filePath;
            List<String> lines = Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8);
            for(String dvdAsString : lines)
                toReturn.add(new Movie(dvdAsString));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return toReturn;
    }

    @Override
    public Movie getMovieByName(String pMovieName) {
        var list = getAllMoviesInRepository();
        for(var movie : list){
            if (movie.getName().equals(pMovieName))
                    return movie;
        }
        return null;
    }
}
