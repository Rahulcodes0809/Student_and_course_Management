package com.lbs.studentmanagementapp.service;

import com.lbs.studentmanagementapp.dto.EnrollmentDTO;
import com.lbs.studentmanagementapp.dto.EnrollmentSaveDTO;
import com.lbs.studentmanagementapp.dto.EnrollmentUpdateDTO;

import java.util.List;

public interface EnrollmentService {
    String addEnrollment(EnrollmentSaveDTO entrollmentSaveDTO);

    List<EnrollmentDTO> getAllEnrollments();

    String updateEnrollment(EnrollmentUpdateDTO enrollmentUpdateDTO);

    boolean deleteEnrollment(int id);
}