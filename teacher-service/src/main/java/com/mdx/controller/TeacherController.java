package com.mdx.controller;

import com.mdx.entity.Teacher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @Description
 * @Author Administrator
 * @Date 2024/4/16 13:55
 **/
@RestController
public class TeacherController {

    /**
     * 查询数据
     * @param id
     * @return
     */
    @GetMapping("/getTeacher/{id}")
    public Teacher getInfo(@PathVariable("id") String id){
        return new Teacher("张三-"+id,"男");
    }

}
