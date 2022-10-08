package com.gcsj.mapper;

import com.gcsj.pojo.PopularMajor;
import com.gcsj.pojo.UnPopularMajor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UnPopularMajorMapper {
    List<UnPopularMajor> selectUPMByRanking(int ranking);
    int updataUPM(UnPopularMajor unPopularMajor);
}
