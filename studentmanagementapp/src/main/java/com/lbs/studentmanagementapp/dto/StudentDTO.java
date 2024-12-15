package com.lbs.studentmanagementapp.dto;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO
{
    private int studentid;
    private String studentname;
    private String address;
    private String phone;
}