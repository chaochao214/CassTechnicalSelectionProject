package com.twc.postconstructdemo.service;

import com.twc.postconstructdemo.strategy.StrategyA;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: twc
 * @Date 2022/1/4 22:54
 **/
@Slf4j
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StrategyAService {
    private final StrategyA strategyA;

     public  void doFilter(){
       List<String>  list = new ArrayList<>();
       list.add("a");
       list.add("b");
       list.add("c");
       List<String> filter = strategyA.filter(list);
       System.out.println(filter);
     }


}
