package com.cydeo.dto;

import com.cydeo.enums.EducationLevel;
import com.cydeo.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"}, ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TeacherDTO {

    @JsonIgnore
    private Long id;

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private LocalDate birthday;

    private Status status;

    private EducationLevel educationLevel;

    private AddressDTO address;

}
