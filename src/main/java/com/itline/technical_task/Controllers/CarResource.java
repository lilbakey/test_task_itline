package com.itline.technical_task.Controllers;

import com.itline.technical_task.Repository.Car;
import com.itline.technical_task.Services.CarService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cars")
public class CarResource {

    private final CarService carService;

    public CarResource(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carService.findById(id).orElseThrow(() -> new IllegalStateException("Машина не найдена"));
    }

    @PostMapping
    public Car create(@RequestBody Car car) {
        return carService.save(car);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        carService.delete(id);
    }

    @PutMapping(path = "/{id}")
    public Car update(@PathVariable Long id, @RequestBody boolean checkBox) {
        Car car = carService.findById(id).orElseThrow(() -> new IllegalStateException("Машина не найдена"));
        car.setCheckBox(checkBox);
        return carService.save(car);
    }
}
