package com.example.mysqlgeometrydemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.example.mysqlgeometrydemo.entity.Company;
import com.example.mysqlgeometrydemo.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/save")
    public String saveCompany(@RequestBody Company company) {
        Long aLong = companyService.saveCompany(company);
        return JSONObject.toJSONString(aLong);
    }

    @GetMapping("/{companyId}")
    public String getById(@PathVariable Long companyId) {
        Company company = companyService.findById(companyId);

        return JSONObject.toJSONString(company);
    }

    /**
     * 获取某个经纬度附近xxx前面的公司信息
     * @return
     */
    @GetMapping("/nearby")
    public String getNearByAddress(String longitude, String latitude, Long kilometers){
        List<Company> companies = companyService.searchNearby(longitude, latitude, kilometers);
        return JSONObject.toJSONString(companies);
    }
}
