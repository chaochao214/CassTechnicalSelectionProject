package com.twc.mapstrutdemo.pojo;

import lombok.Data;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

/**
 * @Author: twc
 * @Date 2021/12/24 21:42
 **/
@Data
public class PersonDO {
  private UserDO userDO;
  private String age;
}
