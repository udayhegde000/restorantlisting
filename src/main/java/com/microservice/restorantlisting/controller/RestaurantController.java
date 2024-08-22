package com.microservice.restorantlisting.controller;

import com.microservice.restorantlisting.dto.RestaurantDTO;
import com.microservice.restorantlisting.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/getAll")
    public ResponseEntity<List<RestaurantDTO>> getAllRestaurants(){
        return new ResponseEntity<>(restaurantService.fetchAll(), HttpStatus.OK);
    }

    @PostMapping("/addRestaurant")
    public ResponseEntity<RestaurantDTO> getAllRestaurants(@RequestBody RestaurantDTO restaurantDTO){
        return new ResponseEntity<>(restaurantService.save(restaurantDTO), HttpStatus.OK);
    }
}
