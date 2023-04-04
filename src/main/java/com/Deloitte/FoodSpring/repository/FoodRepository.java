package com.Deloitte.FoodSpring.repository;

import com.Deloitte.FoodSpring.web.model.FoodDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<FoodDto, Long> {


}
