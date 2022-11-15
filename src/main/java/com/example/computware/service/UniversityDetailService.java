package com.example.computware.service;

import com.example.computware.dao.UniversityDetailRepository;
import com.example.computware.model.UniversityDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityDetailService {

    @Autowired
    UniversityDetailRepository universityDetailRepository;

}
