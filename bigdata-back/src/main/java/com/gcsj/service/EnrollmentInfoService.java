 package com.gcsj.service;

import com.gcsj.pojo.EnrollmentInfo;
import org.springframework.stereotype.Service;


@Service
public interface EnrollmentInfoService {

//    public PageInfo<EnrollmentInfo> getEnrollmentInfoList(int pageNo, int pageSize);
//    public PageInfo<EnrollmentInfo> getEnrollmentInfoList(int pageNo, int PageSize, String school,
//                                                           String profess, String province);
//    public PageInfo<EnrollmentInfo> getEnrollmentInfoList(int pageNo, int PageSize, EnrollmentInfo queryCondition);
//
//    public List<EnrInfoResult> getMajorStatis(String schoolName, String province, boolean isDesc, int topn);


    EnrollmentInfo findById(EnrollmentInfo enrollmentInfo);

    int upData(EnrollmentInfo enrollmentInfo);
}
