package com.arcreane;

import com.arcreane.controller.ConsoleMovieController;
import com.arcreane.controller.IMovieController;
import com.arcreane.controller.WebMovieController;
import com.arcreane.repository.ConsoleMovieRepository;
import com.arcreane.repository.PersistantMovieRepository;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which controller do you want (1 for Console, 2 for web)");
        Integer controllerType = sc.nextInt();
        IMovieController controller = null;
        switch (controllerType){
            case 1 -> controller = new ConsoleMovieController();
            case 2 -> controller = new WebMovieController();
        }
        controller.AddMovie();
    }
}
