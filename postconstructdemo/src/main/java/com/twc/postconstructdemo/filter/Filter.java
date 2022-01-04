package com.twc.postconstructdemo.filter;

import java.util.List;
import lombok.Setter;

/**
 * @Author: twc
 * @Date 2022/1/4 22:25
 **/
@Setter
public abstract class Filter {
   private Filter nextFilter;


   protected  List<String> doNextFilter(List<String> ids){
      if (nextFilter == null) {
          return ids;
      }
      return nextFilter.filter(ids);

   }

   protected abstract List<String> filter(List<String> ids);


}
