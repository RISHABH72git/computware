package com.example.computware.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "college_detail")
public class CollegeDetail {

    @Id
    @Column(name = "c_id")
    private String cId;

    private String cName;

    private String cAddress;

    private String cDescription;

    private int cEstablishedYear;

    private String cType;

    private  String cState;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "university_detail_u_name",referencedColumnName = "u_name")
    private UniversityDetail universityDetail;

    @OneToMany(mappedBy = "collegeDetail")
    @JsonManagedReference
    private List<CourseDetail> courseDetail;


}
