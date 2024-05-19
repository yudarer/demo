package com.example.demo.mapper;

import com.example.demo.entity.Info;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InfoMapper  {
    void insert(Info info);
}
