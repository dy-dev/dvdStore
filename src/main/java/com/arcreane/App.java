package com.arcreane;

import com.arcreane.controller.IMovieController;
import com.arcreane.repository.IMovieRepository;
import com.arcreane.service.IMovieService;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String packageName = "com.arcreane.";
        IMovieController controller = null;
        IMovieService service = null;
        IMovieRepository repository = null;

        System.out.println("Which controller name do you want to use");
        String controllerName = sc.nextLine();
        controllerName = packageName+ "controller." + controllerName + "MovieController";

        System.out.println("Which service do you want to use");
        String serviceName = sc.nextLine();
        serviceName = packageName + "service." + serviceName + "MovieService";

        System.out.println("Which Repository do you want to use");
        String repositoryName = sc.nextLine();
        repositoryName = packageName+ "repository." + repositoryName + "MovieRepository";

        try {
            controller = (IMovieController) Class.forName(controllerName).getDeclaredConstructor().newInstance();
            service = (IMovieService) Class.forName(serviceName).getDeclaredConstructor().newInstance();
            repository = (IMovieRepository) Class.forName(repositoryName).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        controller.setService(service);
        service.setRepository(repository);

        controller.AddMovie();
    }
}
