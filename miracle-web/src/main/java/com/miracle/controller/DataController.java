package com.miracle.controller;

import com.miracle.dao.FirstDao;
import com.miracle.mapper.DictMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Zhou Xuanzi
 * @Description:
 * @create: 2018/8/22 16:02
 * @Copyright: 2018-2019
 **/
@RestController
public class DataController {
    private static final Logger logger = LogManager.getLogger(DataController.class);

    @Autowired
    DictMapper dictMapper;

    @RequestMapping("/test")
    public Map test(){
        logger.info("请求url：/test");
        String result = "result-success";
        Map resultMap = new HashMap(16);
        resultMap.put("result",result);
        List<FirstDao> firstDao = dictMapper.queryList();
        resultMap.put("firstDao",firstDao);
        logger.info("返回数据："+resultMap);
        return resultMap;
    }
}
