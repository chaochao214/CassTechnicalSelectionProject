package com.twc.postconstructdemo.strategy;

import java.util.List;

/**
 * @Author: twc
 * @Date 2022/1/4 22:24
 **/
public interface FilterStrategy {
     List<String> filter(List<String> ids);
}
