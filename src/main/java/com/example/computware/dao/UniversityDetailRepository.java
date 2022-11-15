package com.example.computware.dao;

import com.example.computware.model.UniversityDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityDetailRepository extends JpaRepository<UniversityDetail,String> {
}
