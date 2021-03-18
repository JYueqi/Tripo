package com.db.demo01.Mapper;

import com.db.demo01.pojo.Route;
import com.db.demo01.pojo.routehit;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface routehitMapper {

    List<routehit> getRoutehit();

    int getRouteHit(String routename);

    void updateRouteHit(String routeName,int rouhit);

}
