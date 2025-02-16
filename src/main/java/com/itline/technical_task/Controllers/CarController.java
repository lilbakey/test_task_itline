package com.itline.technical_task.Controllers;

import com.itline.technical_task.Services.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/itline")
public class CarController {



    private final CarService carService;
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String showPage(Model model) {
        model.addAttribute("cars", carService.getAllCars());
        return "itline";
    }

}
