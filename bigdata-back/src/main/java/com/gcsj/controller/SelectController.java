package com.gcsj.controller;

import com.alibaba.fastjson.JSONObject;
import com.gcsj.service.EnrInfoService;
import com.gcsj.pojo.EnrollmentInfo;
import com.gcsj.service.EnrollmentInfoService;
import com.gcsj.vo.PageRequest;
import com.gcsj.vo.PageResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@Controller
public class  SelectController {

    @Autowired
    EnrInfoService enrInfoService;

    @Autowired
    EnrollmentInfoService enrollmentInfoService;

    @ApiOperation(value = "查询招生信息")
    @PostMapping("/selectEnrollmentInfo")
    public Object toEnrollmentInfoQuery(@RequestBody PageRequest pageRequest) {
        PageRequest pageQuery = new PageRequest();
        pageQuery.setPageNum(pageRequest.getPageNum());
        pageQuery.setPageSize(pageRequest.getPageSize());
//        System.out.println(pageRequest);
        PageResult pageResult = enrInfoService.selectEnrInfoListBy(pageQuery, pageRequest.getEnrollmentInfo());
        return pageResult;

    }

    @PostMapping("/upEnrollmentInfo")
    @ApiOperation("修改专业信息")
    public JSONObject upEnrollmentInfo(@RequestBody EnrollmentInfo enrollmentInfo) {
        JSONObject jsonObject = new JSONObject();
        int i = enrollmentInfoService.upData(enrollmentInfo);
        if(i == 1) {
            jsonObject.put("code", 200);
            jsonObject.put("msg", "编辑成功");
        }
        else {
            jsonObject.put("code", 201);
            jsonObject.put("msg", "编辑失败");
        }
        return jsonObject;
    }

//    @GetMapping("/hotmajor")
//    public Object toHotMajorQuery(@RequestParam("pageNum") int pageNum,
//                                  @RequestParam("pageSize") int pageSize,
//                                  String schoolName,String province){
//        PageRequest pageQuery = new PageRequest();
//        pageQuery.setPageNum(pageNum);
//        pageQuery.setPageSize(pageSize);
//        return enrInfoService.selectMajorListBy(pageQuery,schoolName,province,true);
//    }
//
//    @GetMapping("/coolmajor")
//    public Object toCoolMajorQuery(@RequestParam("pageNum") int pageNum,
//                                   @RequestParam("pageSize") int pageSize,
//                                   String schoolName,String province){
//        PageRequest pageQuery = new PageRequest();
//        pageQuery.setPageNum(pageNum);
//        pageQuery.setPageSize(pageSize);
//        return enrInfoService.selectMajorListBy(pageQuery,schoolName,province,false);
//    }
}

