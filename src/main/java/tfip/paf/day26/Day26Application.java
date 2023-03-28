package tfip.paf.day26;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tfip.paf.day26.Repositories.ShowsRepository;

@SpringBootApplication
public class Day26Application implements CommandLineRunner {

	@Autowired
	private ShowsRepository showsRepo;

	public static void main(String[] args) {
		SpringApplication.run(Day26Application.class, args);
	}

	@Override
	public void run(String... args) {

		//List<Document> results = showsRepo.findTvShowByName("Game of Thrones");
		//List<Document> results = showsRepo.findShowtimeLessThan(30);
		// List<Document> results = showsRepo.findMoviesByStatus("Ended");
		// for (Document d: results) {
		// 	System.out.printf(">> %s\n", d.toJson());
		// }
		System.out.printf("");

	}
}