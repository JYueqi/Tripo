package com.db.demo01.Mapper;


import com.db.demo01.pojo.Spot;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SpotMapper {

    //通过名字查询景点信息
    Spot getSpotByName(String spotname);

    //查询所哟景点
    List<Spot> getAllSpot();


}
