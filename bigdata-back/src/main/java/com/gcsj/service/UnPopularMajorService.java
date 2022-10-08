package com.gcsj.service;

import com.gcsj.pojo.PopularMajor;
import com.gcsj.pojo.UnPopularMajor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UnPopularMajorService {

    List<UnPopularMajor> selectUPMByRanking(int ranking);//根据ranking查询冷门专业

    int updataUPM(UnPopularMajor unPopularMajor);
}
