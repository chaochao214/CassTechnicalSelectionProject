package com.twc.postconstructdemo.strategy;

import com.twc.postconstructdemo.filter.FilterB;
import com.twc.postconstructdemo.filter.FilterC;
import com.twc.postconstructdemo.filter.FilterD;
import java.util.List;
import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: twc
 * @Date 2022/1/4 22:18
 **/
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StrategyB  implements FilterStrategy{

  private final FilterB filterB;
  private final FilterC filterC;
  private final FilterD filterD;


  @PostConstruct
  public void init(){
     filterB.setNextFilter(filterC);
     filterC.setNextFilter(filterD);
  }

  @Override
  public List<String> filter(List<String> ids) {
    return filterB.filter(ids);
  }
}
