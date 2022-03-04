package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mircea = new Student(
                    "Mircea",
                    "MNealcos@gmail.com",
                    LocalDate.of(2002, Month.JULY,15)
                    );
            Student oana = new Student(
                    "Oana",
                    "oana@gmail.com",
                    LocalDate.of(2011, Month.DECEMBER,27)
                    );
            repository.saveAll(
                    List.of(mircea,oana)
            );
        };
    }
}
