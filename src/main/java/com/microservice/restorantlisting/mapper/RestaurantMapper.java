package com.microservice.restorantlisting.mapper;

import com.microservice.restorantlisting.dto.RestaurantDTO;
import com.microservice.restorantlisting.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper
public interface RestaurantMapper {
   RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);
   Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);
   RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);
}
