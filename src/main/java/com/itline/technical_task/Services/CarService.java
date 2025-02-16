package com.itline.technical_task.Services;

import com.itline.technical_task.Repository.Car;
import com.itline.technical_task.Repository.CarRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @PostConstruct
    public void init() {
    }

    public List<Car> getAllCars() {
        return carRepository.findAllByOrderByIdAsc();
    }

    public Optional<Car> findById(long id) {
        return carRepository.findById(id);
    }

    public Car save(Car car) {
        return carRepository.save(car);
    }

    public void delete(long id) {
        carRepository.deleteById(id);
    }


}
