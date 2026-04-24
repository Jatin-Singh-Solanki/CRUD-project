package com.alpharecon.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserDto {

    @NotBlank(message = "First name is required")
    @Size(max = 50, message = "First name cannot be more than 50 characters")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(max = 50, message = "Last name cannot be more than 50 characters")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Please enter a valid email")
    @Size(max = 100, message = "Email cannot be more than 100 characters")
    private String email;

    @Size(max = 1000, message = "Note cannot be more than 1000 characters")
    private String note;

    public UserDto() {
    }

    public UserDto(String firstName, String lastName, String email, String note) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.note = note;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}