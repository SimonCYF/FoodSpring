package com.Deloitte.FoodSpring.services;

import com.Deloitte.FoodSpring.payloads.FoodPayload;
import com.Deloitte.FoodSpring.web.model.FoodDto;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Food  {

    FoodDto food();

    FoodDto createFood(FoodPayload foodPayload);
}
