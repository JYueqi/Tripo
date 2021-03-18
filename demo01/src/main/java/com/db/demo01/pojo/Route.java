package com.db.demo01.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//旅游线路实体类
public class Route {

    private Integer id;
    private String Start;
    private String End;
    private String RouteName;
    private Integer price;
    private Integer Days;
    private String RouteInfo;
    private String StartPicUrl1;
    private String StartPicUrl2;
    private String StartPicUrl3;
    private String EndPicUrl1;
    private String EndPicUrl2;
    private String EndPicUrl3;

}
