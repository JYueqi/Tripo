package com.db.demo01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class spothit {

    private String spotname;
    private String location;
    private Integer hit;

}
