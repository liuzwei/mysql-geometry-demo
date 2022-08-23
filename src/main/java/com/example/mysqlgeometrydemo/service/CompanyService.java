package com.example.mysqlgeometrydemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mysqlgeometrydemo.entity.Company;
import com.example.mysqlgeometrydemo.repository.CompanyRepository;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public Company findById(Long companyId) {

        return companyRepository.getById(companyId);
    }

    public Long saveCompany(Company company) {
        company.setGeometry("POINT("+company.getLatitude()+" "+company.getLongitude()+")");
        companyRepository.save(company);
        return company.getId();
    }

    public List<Company> searchNearby(String longitude, String latitude, Long kilometers) {

        return companyRepository.lambdaQuery()
            .apply("ST_Distance_Sphere(geometry, POINT ({0},{1}))<={2}", longitude, latitude, kilometers)
            .list();
    }
}
