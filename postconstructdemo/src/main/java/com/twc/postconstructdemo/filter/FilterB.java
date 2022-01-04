package com.twc.postconstructdemo.filter;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author: twc
 * @Date 2022/1/4 22:16
 **/
@Slf4j
@Component
public class FilterB  extends Filter {

  @Override
  public List<String> filter(List<String> ids) {
    log.info(" FilterB -》");
    return doNextFilter(ids);
  }
}
