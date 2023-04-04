package com.Deloitte.FoodSpring.web.controller;

import com.Deloitte.FoodSpring.payloads.FoodPayload;
import com.Deloitte.FoodSpring.services.FoodService;
import com.Deloitte.FoodSpring.web.model.FoodDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.net.ssl.SSLEngineResult;

@RestController
@RequestMapping ("/api/v1")
public class FoodController {

    @Autowired
    FoodService foodService;
    @GetMapping("/getAllFood")
    public ResponseEntity<FoodDto> getFood(){
        return new ResponseEntity<>(foodService.food(), HttpStatus.OK);
    }


    @PostMapping("/createFood")
    public ResponseEntity<FoodDto> createFood(@RequestBody FoodPayload food){
        return new ResponseEntity<>(foodService.createFood(food), HttpStatus.OK);
    }
}
