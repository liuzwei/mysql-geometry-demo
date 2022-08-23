package com.example.mysqlgeometrydemo.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.mysqlgeometrydemo.config.GeometryTypeHandler;

import lombok.Data;

@Data
@TableName(value = "company", autoResultMap = true)
public class Company implements Serializable {

    @TableId(value = "id")
    private Long id;
    private String name;
    private String longitude;
    private String latitude;

    @TableField(typeHandler = GeometryTypeHandler.class)
    private String geometry;
}
