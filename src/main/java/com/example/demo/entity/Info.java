package com.example.demo.entity;

import lombok.Data;

@Data
//@TableName("info")
public class Info {

//    @TableId(type = IdType.AUTO)
    private Long id;
    private String band;
}
