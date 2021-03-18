package com.db.demo01.Mapper;

import com.db.demo01.pojo.spothit;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface spothitMapper {

    List<String> getSpothit();

    int getSpotHit(String spotname);

    void updateSpotHit(String spotname,int hit);
}
