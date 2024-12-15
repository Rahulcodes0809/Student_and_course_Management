package com.lbs.studentmanagementapp.service;

import com.lbs.studentmanagementapp.dto.BatchDTO;
import com.lbs.studentmanagementapp.dto.BatchSaveDTO;
import com.lbs.studentmanagementapp.dto.BatchUpdateDTO;

import java.util.List;

public interface BatchService {
    String addBatch(BatchSaveDTO batchSaveDTO);


    List<BatchDTO> getAllBatches();

    String updateBatch(BatchUpdateDTO batchUpdateDTO);

    boolean deleteBatch(int id);
}