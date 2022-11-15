package com.example.computware.controller;

import com.example.computware.model.UniversityDetail;
import com.example.computware.service.UniversityDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityDetailController {

    @Autowired
    UniversityDetailService universityDetailService;

}
