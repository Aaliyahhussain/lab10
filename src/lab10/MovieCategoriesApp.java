package lab10;

import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class MovieCategoriesApp {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		Movie movie = new Movie();
		movie.getGenreName();
		movie.getTitleName();
		System.out.println(movie);

		System.out.println("Welcome to the Movie List Application");
		System.out.println();
		System.out.println("There are 10 movies in the list");
		String choice = "y";

		ArrayList<Movie> action = new ArrayList<>();
		movie = new Movie();
		movie.setTitleName("Mission Impossble");
		movie.setGenreName("Action");
		action.add(movie);

		movie = new Movie();
		movie.setTitleName("Avengers");
		movie.setGenreName("Action");
		action.add(movie);

		movie = new Movie();
		movie.setTitleName("Zootopia");
		movie.setGenreName("Animated");
		action.add(movie);

		movie = new Movie();
		movie.setTitleName("The Book Of Life");
		movie.setGenreName("Animated");
		action.add(movie);

		movie = new Movie();
		movie.setTitleName("The Hangover");
		movie.setGenreName("Comedy");
		action.add(movie);

		movie = new Movie();
		movie.setTitleName("Neighbors");
		movie.setGenreName("Comedy");
		action.add(movie);

		movie = new Movie();
		movie.setTitleName("IT");
		movie.setGenreName("Horror");
		action.add(movie);

		movie = new Movie();
		movie.setTitleName("Insidious");
		movie.setGenreName("Horror");
		action.add(movie);

		movie = new Movie();
		movie.setTitleName("The Matrix");
		movie.setGenreName("SciFi");
		action.add(movie);

		movie = new Movie();
		movie.setTitleName("Avatar");
		movie.setGenreName("SciFi");
		action.add(movie);



		while (choice.equalsIgnoreCase("y")) {
			System.out.print("What genre are you interested in?");

			String movielist = scnr.nextLine();
			switch (movielist) {

			case "action":
				System.out.println(action);
				break;
			case "animated":
				System.out.println(animated);
				break;
			case "comedy":
				System.out.println(comedy);
				break;
			case "horror":
				System.out.println(horror);
				break;
			case "scifi":
				System.out.println(scifi);
				break;
			}

		System.out.print("Continue? y/n): ");
		choice = scnr.next();
	}

}
	
}
