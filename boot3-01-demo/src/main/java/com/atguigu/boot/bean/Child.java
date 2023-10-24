package com.atguigu.boot.bean;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @Author Jack丶WeTa
 * @Date 2023/7/21 16:44
 * @Description TODO
 */
@Data
public class Child {

    private String name;

    private Integer age;

    private Date birthday;

    private List<String> text;
}
