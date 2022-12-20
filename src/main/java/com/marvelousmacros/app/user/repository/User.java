package com.marvelousmacros.app.user.repository;

import com.marvelousmacros.app.enums.ActivityLevel;
import com.marvelousmacros.app.enums.FitnessGoal;
import com.marvelousmacros.app.enums.Gender;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("users")
public class User {
    @Id
    private String id;

    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Gender gender;
    private double weightInKg;
    private double heightInCm;
    private double bodyFatPercentage;
    private ActivityLevel activityLevel;
    private FitnessGoal fitnessGoal;
}
