package com.itline.technical_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TechnicalTaskApplication {

    public static void main(String[] args) {
        checkArgs(args);
    }

    private static void checkArgs(String[] args) {
        if (args.length > 0 && args[0].equalsIgnoreCase("spring")) {
            SpringApplication.run(TechnicalTaskApplication.class, args);
        } else if (args.length > 0 && args[0].equalsIgnoreCase("javafx")) {
            System.out.println("javafx");
        } else if (args.length == 0) {
            System.out.println("Отсутствуют аргументы командной строки");
        } else {
            System.out.println("Неизвестные аргументы командной строки");
        }
    }

}
