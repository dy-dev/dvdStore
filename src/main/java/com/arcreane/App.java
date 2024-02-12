package com.arcreane;

import com.arcreane.controller.ConsoleController;
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
        ConsoleController controller = new ConsoleController();
        controller.AddMovie();
    }
}
