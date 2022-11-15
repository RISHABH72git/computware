package com.example.computware.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@Entity(name = "course_detail")
public class CourseDetail {

    @Id
    @Column(name = "course_id")
    private long courseId;

    private String courseName;

    private String courseType;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "college_detail_c_id", referencedColumnName = "c_id")
    private CollegeDetail collegeDetail;

}
