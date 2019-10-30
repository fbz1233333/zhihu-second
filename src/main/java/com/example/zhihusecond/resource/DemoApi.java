package com.example.zhihusecond.resource;

import com.example.zhihusecond.dao.DemoDao;
import com.example.zhihusecond.dto.DemoF01Request;
import com.example.zhihusecond.dto.DemoF01Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoApi {

    @Autowired
    DemoDao demoDao;

    @GetMapping("/user/{id}")
    public DemoF01Response get(@PathVariable Long id){
        DemoF01Request demoF01Request=new DemoF01Request();
        demoF01Request.setId(id);
        return demoDao.getDemoById(demoF01Request);
    }

}
