package com.gcsj.service.impl;

import com.gcsj.mapper.UnPopularMajorMapper;

import com.gcsj.pojo.UnPopularMajor;
import com.gcsj.service.UnPopularMajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnPopularMajorServiceImpl implements UnPopularMajorService {

    @Autowired
    UnPopularMajorMapper unPopularMajorMapper;

    public List<UnPopularMajor> selectUPMByRanking(int ranking){
        return unPopularMajorMapper.selectUPMByRanking(ranking);
    };

    public int updataUPM(UnPopularMajor unPopularMajor){
        return unPopularMajorMapper.updataUPM(unPopularMajor);
    };
}
