package com.miracle.dao;

import lombok.Data;

import java.util.Date;

/**
 * @author Zhou Xuanzi
 * @Description:
 * @create: 2018/7/23 18:55
 * @Copyright: 2018-2019
 **/

@Data
public class FirstDao {

    private int id;
    private Date createTime;
    private Date updateTime;
    private String key;
    private String value;
    private int valid;

}
