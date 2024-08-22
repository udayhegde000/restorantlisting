package com.microservice.restorantlisting.dto;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RestaurantDTO {
    private Integer restaurantId;

    private String restaurantName;
}
