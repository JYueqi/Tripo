package com.db.demo01.Mapper;

import com.db.demo01.pojo.Spot;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface PriceMapper {

    Integer getSpotPricehot(String spotname);

    Integer getSpotPriceno(String spotname);

    String getSpotPriceinfo(String spotname);
}
