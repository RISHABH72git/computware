package com.example.computware.model;

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
@Table(name = "university_detail")
public class UniversityDetail {

    @Id
    @Column(name = "u_name")
    private String uName;

    private String uType;

    private String uSituatedCity;

    private String uWebsite;

    private String uAddress;

    private  int uEstablishedYear;

    private String uDescription;

    private long uPhoneNo;

    private String uEmail;

    private long uPinCode;

    private String  uSituatedState;

    @OneToMany(mappedBy ="universityDetail")
    @JsonManagedReference
    private List<CollegeDetail> collegeDetail;
}
