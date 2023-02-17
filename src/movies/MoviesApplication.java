package movies;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");
        System.out.println("Enter your choice: ");

        String userInput = sc.nextLine();
        for(int i = 0; i < MoviesArray.findAll().length; i++){
            if(userInput.equalsIgnoreCase("1")){
                System.out.println(MoviesArray.findAll()[i].getName() + " " + MoviesArray.findAll()[i].getCategory());
            }else if(userInput.equalsIgnoreCase("2")){
                if(MoviesArray.findAll()[i].getCategory().equals("animated")){
                    System.out.println(MoviesArray.findAll()[i].getName()  + " " + MoviesArray.findAll()[i].getCategory());
                }
            }else if(userInput.equalsIgnoreCase("3")){
                if(MoviesArray.findAll()[i].getCategory().equals("drama")){
                    System.out.println(MoviesArray.findAll()[i].getName()  + " " + MoviesArray.findAll()[i].getCategory());
                }
            }else if(userInput.equalsIgnoreCase("4")){
                if(MoviesArray.findAll()[i].getCategory().equals("horror")){
                    System.out.println(MoviesArray.findAll()[i].getName()  + " " + MoviesArray.findAll()[i].getCategory());
                }
            }else if(userInput.equalsIgnoreCase("5")){
                if(MoviesArray.findAll()[i].getCategory().equals("scifi")){
                    System.out.println(MoviesArray.findAll()[i].getName()  + " " + MoviesArray.findAll()[i].getCategory());
                }
            }
        }
    }
}



