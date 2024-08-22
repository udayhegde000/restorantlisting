package com.microservice.restorantlisting.service;

import com.microservice.restorantlisting.dto.RestaurantDTO;
import com.microservice.restorantlisting.entity.Restaurant;
import com.microservice.restorantlisting.mapper.RestaurantMapper;
import com.microservice.restorantlisting.repository.RestaurantRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepository restaurantRepository;

   // @Autowired
    //RestaurantMapper restaurantMapper;

    public List<RestaurantDTO> fetchAll() {
        List<Restaurant> restaurantList = restaurantRepository.findAll();
        return restaurantList.stream().map(RestaurantMapper.INSTANCE::mapRestaurantToRestaurantDTO).toList();
    }

    public RestaurantDTO save(RestaurantDTO restaurantDTO) {
        Restaurant restaurant = RestaurantMapper.INSTANCE.mapRestaurantDTOToRestaurant(restaurantDTO);
        restaurant = restaurantRepository.save(restaurant);
        return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurant);
    }

    public Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO){
       return  new Restaurant(restaurantDTO.getRestaurantId(),restaurantDTO.getRestaurantName());
    }

    public RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant){
        return new RestaurantDTO(restaurant.getRestaurantId(),restaurant.getRestaurantName());
    }
}
