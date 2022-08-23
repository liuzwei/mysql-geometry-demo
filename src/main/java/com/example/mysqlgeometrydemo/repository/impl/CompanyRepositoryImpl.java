package com.example.mysqlgeometrydemo.repository.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mysqlgeometrydemo.entity.Company;
import com.example.mysqlgeometrydemo.mapper.CompanyMapper;
import com.example.mysqlgeometrydemo.repository.CompanyRepository;

@Service
public class CompanyRepositoryImpl extends ServiceImpl<CompanyMapper, Company> implements CompanyRepository {

}
