package com.db.demo01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//景点表实体类
public class Spot {

    private String SpotName;
    private String Location;
    private String SpotInfo;
    private Integer pri_hot;
    private Integer pri_no;
    private String pri_info;
    private String SpotPicUrl1;
    private String SpotPicUrl2;
    private String SpotPicUrl3;

}
