package com.arcreane;

import com.arcreane.controller.IMovieController;
import com.arcreane.repository.IMovieRepository;
import com.arcreane.service.IMovieService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@Configuration
@ComponentScan({
        "com.arcreane.controller.console",
        "com.arcreane.repository.persistant",
        "com.arcreane.service.console"})
@PropertySource("application.properties")
public class App {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        IMovieController controller = context.getBean(IMovieController.class);
        controller.AddMovie();
//        Scanner sc = new Scanner(System.in);
//
//        String packageName = "com.arcreane.";
//        IMovieController controller = null;
//        IMovieService service = null;
//        IMovieRepository repository = null;
//
//        System.out.println("Which controller name do you want to use");
//        String controllerName = sc.nextLine();
//        controllerName = packageName+ "controller." + controllerName + "MovieController";
//
//        System.out.println("Which service do you want to use");
//        String serviceName = sc.nextLine();
//        serviceName = packageName + "service." + serviceName + "MovieService";
//
//        System.out.println("Which Repository do you want to use");
//        String repositoryName = sc.nextLine();
//        repositoryName = packageName+ "repository." + repositoryName + "MovieRepository";
//
//        try {
//            controller = (IMovieController) Class.forName(controllerName).getDeclaredConstructor().newInstance();
//            service = (IMovieService) Class.forName(serviceName).getDeclaredConstructor().newInstance();
//            repository = (IMovieRepository) Class.forName(repositoryName).getDeclaredConstructor().newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        controller.setService(service);
//        service.setRepository(repository);
//
//        controller.AddMovie();
    }
}
