package com.arcreane;

import com.arcreane.entity.Category;
import com.arcreane.entity.Movie;
import com.arcreane.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Give movie name");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println("Movie category");
        String catS = sc.nextLine();
        Category catE =  Category.valueOf(catS);
        Movie movie = new Movie(title,catE);
        MovieService service = new MovieService();
        service.registerMovie(movie);
    }
}
