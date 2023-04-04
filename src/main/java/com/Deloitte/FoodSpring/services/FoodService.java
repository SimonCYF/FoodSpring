package com.Deloitte.FoodSpring.services;

import com.Deloitte.FoodSpring.payloads.FoodPayload;
import com.Deloitte.FoodSpring.repository.FoodRepository;
import com.Deloitte.FoodSpring.web.model.FoodDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class FoodService {

    @Autowired
    FoodRepository foodRepository;

    public FoodDto food() {
        return FoodDto.builder().id(UUID.randomUUID())
                .name("Fried Rice").price(10.99).build();
    }


    public FoodDto createFood(FoodPayload foodPayload) {
        FoodDto foodDto = new FoodDto();
        foodDto.setId(UUID.randomUUID());
        foodDto.setName(foodPayload.getName());
        foodDto.setPrice(foodPayload.getPrice());

        System.out.println(foodDto.getName());
        System.out.println(foodDto);

        foodRepository.save(foodDto);
        return foodDto;
    }

}
