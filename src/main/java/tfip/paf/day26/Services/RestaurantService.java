package tfip.paf.day26.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tfip.paf.day26.Models.Restaurant;
import tfip.paf.day26.Repositories.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepo;

	public List<String> getCuisines() {
		return restaurantRepo.getCuisines();
	}

	public List<Restaurant> getRestaurantsByCuisine(String cuisine) {
		return restaurantRepo.getRestaurantsByCuisine(cuisine);
	}
}
