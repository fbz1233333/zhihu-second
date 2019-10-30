package com.example.zhihusecond.dao;

import com.example.zhihusecond.dto.DemoF01Request;
import com.example.zhihusecond.dto.DemoF01Response;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoDao {

    DemoF01Response getDemoById(DemoF01Request demoF01Request);
}
