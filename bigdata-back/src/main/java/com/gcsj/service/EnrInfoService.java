package com.gcsj.service;

import com.gcsj.pojo.EnrollmentInfo;
import com.gcsj.vo.PageRequest;
import com.gcsj.vo.PageResult;
import org.springframework.stereotype.Service;

@Service
public interface EnrInfoService {

    PageResult selectEnrInfoListBy(PageRequest pageRequest, EnrollmentInfo enrollmentInfo);

    PageResult selectMajorListBy(PageRequest pageRequest,String schoolName,String province,boolean isDesc);

}
