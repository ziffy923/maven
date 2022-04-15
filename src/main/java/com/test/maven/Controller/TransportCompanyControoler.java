package com.test.maven.Controller;

import java.util.List;

import com.test.maven.Model.TransportCompany;
import com.test.maven.Repository.TransportCompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("company")
@RestController
public class TransportCompanyControoler {
    @Autowired
    private TransportCompanyRepository transportCompanyRepository;


    @GetMapping
    public List<TransportCompany> getCompanList(){
        return transportCompanyRepository.findAll();
    }

    @PostMapping
    public TransportCompany createTransportCompany(@RequestBody TransportCompany transportCompany){
        return transportCompanyRepository.save(transportCompany);
    }

    @GetMapping
    public String get(){
        return "data";
    }

    
}