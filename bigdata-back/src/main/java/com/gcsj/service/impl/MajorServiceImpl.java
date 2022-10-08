package com.gcsj.service.impl;

import com.gcsj.mapper.MajorMapper;
import com.gcsj.pojo.Major;
import com.gcsj.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorServiceImpl implements MajorService {
    @Autowired
    MajorMapper majorMapper;

    public List<Major> selectMajorByName(String profess){
        return majorMapper.selectMajorByName(profess);
    }
    public List<Major> selectMajorByCode(String majorCode){
        return majorMapper.selectMajorByCode(majorCode);
    }

}
