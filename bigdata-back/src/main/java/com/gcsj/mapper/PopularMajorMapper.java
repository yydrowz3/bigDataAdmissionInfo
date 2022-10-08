package com.gcsj.mapper;

import com.gcsj.pojo.PopularMajor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PopularMajorMapper {
    List<PopularMajor> selectPMByRanking(int ranking);
    int updataPM(PopularMajor popularMajor);
}
