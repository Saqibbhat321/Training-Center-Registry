package com.traini8.training_center_registry.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.Setter;

import java.util.List;

@Data
@Entity
public class TrainingCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "CenterName is mandatory")
    @Size(max = 40, message = "CenterName must be less than 40 characters")
    private String centerName;

    @NotBlank(message = "CenterCode is mandatory")
    @Size(min = 12, max = 12, message = "CenterCode must be exactly 12 characters")
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "CenterCode must be alphanumeric")
    private String centerCode;

    @Embedded
    @NotNull(message = "Address is mandatory")
    private Address address;

    @Min(value = 1, message = "Student Capacity must be at least 1")
    private int studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;
    private long createdOn;
    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }

    @Email(message = "ContactEmail must be a valid email address")
    private String contactEmail;

    @NotBlank(message = "ContactPhone is mandatory")
    @Pattern(regexp = "^[0-9]{10}$", message = "ContactPhone must be a 10-digit number")
    private String contactPhone;
}
