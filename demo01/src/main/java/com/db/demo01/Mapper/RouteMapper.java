package com.db.demo01.Mapper;


import com.db.demo01.pojo.Route;
import com.db.demo01.pojo.Spot;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RouteMapper {


    Route getRouteBySpot(String start);


    List<Route>  getAllRoute();
}
