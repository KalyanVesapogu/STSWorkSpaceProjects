package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.TripBooking;
import com.example.service.TripBookingService;

@RestController
@RequestMapping("/tripbooking")
public class TripBookingController {
	
	@Autowired
	TripBookingService tripBookingService;
	
	@PostMapping(value = "/insert")
	public TripBooking insertTripBooking(@RequestBody TripBooking tripBooking) {
		return this.tripBookingService.insertTripBooking(tripBooking);
	}
	
	@PutMapping(value = "/update")
	public TripBooking updateTripBooking(@RequestBody TripBooking tripBooking) {
		return this.tripBookingService.updateTripBooking(tripBooking);
	}
	
	@DeleteMapping(value = "/delete/{tripBookingId}")
	public boolean deleteTripBooking(@PathVariable(name = "tripBookingId") int tripBookingId) {
		return this.tripBookingService.deleteTripBooking(tripBookingId);
	}
	
	@GetMapping(value = "/viewAllTrips")
	public List<TripBooking> viewAllTrips(){
		return this.tripBookingService.viewAllTrips();
	}
	
}
