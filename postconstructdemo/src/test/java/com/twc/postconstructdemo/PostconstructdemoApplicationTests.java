package com.twc.postconstructdemo;

import com.twc.postconstructdemo.service.StrategyAService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PostconstructdemoApplicationTests {

  @Test
  void contextLoads() {
  }



  @Autowired
  StrategyAService strategyAService;
  /**
   * @Description
   * @Date 2022/1/4 22:49
   **/
  @Test
  public void testA() {

    System.out.println("未开始过滤");
    strategyAService.doFilter();
  }

}
