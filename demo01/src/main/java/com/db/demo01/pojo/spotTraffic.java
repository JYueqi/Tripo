package com.db.demo01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//景点交通实体类
public class spotTraffic {

    private String SpotName;
    private String Sub_Bus;
    private String Airplane;
    private String Train;
}
