package com.hotelbreweries.application;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "breweries-service", url="http://breweries-service:8072")
public interface IClientBreweriesService {
	
	@GetMapping("/breweries/search-breweries-by-location")
	public String findBreweries(@RequestParam String location);
}
