package com.twc.postconstructdemo.strategy;

import com.twc.postconstructdemo.filter.FilterA;
import com.twc.postconstructdemo.filter.FilterB;
import com.twc.postconstructdemo.filter.FilterC;
import java.util.List;
import javax.annotation.PostConstruct;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: twc
 * @Date 2022/1/4 22:18
 **/
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StrategyA  implements  FilterStrategy{

  private final FilterA filterA;
  private final FilterB filterB;
  private final FilterC filterC;

  @Override
  public List<String> filter(List<String> ids) {
    return filterA.filter(ids);
  }


  @PostConstruct
  public void init(){
       filterA.setNextFilter(filterB);
       filterB.setNextFilter(filterC);
  }


}
