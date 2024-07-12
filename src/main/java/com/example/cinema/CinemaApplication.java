package com.example.cinema;

import com.example.cinema.models.MovieEntity;
import com.example.cinema.repositotries.CinemaRepository;
import com.example.cinema.repositotries.DirectorRepository;
import com.example.cinema.repositotries.MovieRepository;
import com.example.cinema.repositotries.StudioRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CinemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			MovieRepository movieRepository,
			StudioRepository studioRepository,
			DirectorRepository directorRepository,
			CinemaRepository cinemaRepository
	) {
		return args -> {
			for(int i=0; i<20; i++) {
				Faker faker = new Faker();
				var movie = MovieEntity.builder()
						.title(faker.book().title())
						.description(faker.lorem().paragraph())
						.build();

				movieRepository.save(movie);
			}
		};
	}
}
