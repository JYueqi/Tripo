package com.db.demo01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Price {

    private String SpotName;
    private String Type;
    private Integer pri_hotseason;
    private Integer pri_nomalseason;

}
