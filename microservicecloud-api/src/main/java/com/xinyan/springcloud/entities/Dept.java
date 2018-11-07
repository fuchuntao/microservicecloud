package com.xinyan.springcloud.entities;

import lombok.Data;


@Data
public class Dept {
    /**主键*/
    private Long deptOn;

    private String deptName;

    private String dbSource;


}
