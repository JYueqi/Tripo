package com.db.demo01.Mapper;

import com.db.demo01.pojo.roucomments;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface roucomMapper {

    List<roucomments> getAllComments(String routename);

}
