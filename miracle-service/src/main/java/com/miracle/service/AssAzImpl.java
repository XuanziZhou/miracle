package com.miracle.service;

import com.miracle.interfaces.AssAz;
import org.springframework.stereotype.Service;

/**
 * @author Zhou Xuanzi
 * @Description:
 * @create: 2018/8/22 18:01
 * @Copyright: 2018-2019
 **/
@Service
public class AssAzImpl implements AssAz {
    @Override
    public String indexString() {
        return "AssAz Success";
    }
}
