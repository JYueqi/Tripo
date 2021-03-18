package com.db.demo01.Mapper;

import com.db.demo01.pojo.Spot;
import com.db.demo01.pojo.spotTraffic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TrafficMapper {

    //通过景点名得到交通信息
    spotTraffic getSpotTraffic(String spotname);

}
