package com.test.maven.Repository;

import com.test.maven.Model.TransportCompany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportCompanyRepository extends JpaRepository<TransportCompany, Long> {
    
}
