package com.db.demo01.Mapper;


import com.db.demo01.pojo.spotcomments;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.swing.event.ListDataEvent;
import java.util.List;

@Mapper
@Repository

public interface spotcomMapper {

    List<spotcomments> getAllSpotCom(String spotname);


}
