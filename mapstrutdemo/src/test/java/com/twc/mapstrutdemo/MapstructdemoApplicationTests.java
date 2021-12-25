package com.twc.mapstrutdemo;

import com.twc.mapstrutdemo.Factory.DtoFactory;
import com.twc.mapstrutdemo.pojo.PersonDO;
import com.twc.mapstrutdemo.pojo.PersonDTO;
import com.twc.mapstrutdemo.pojo.UserDO;
import com.twc.mapstrutdemo.pojo.UserDTO;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * mapStruct  演示示例
 * https://www.baeldung.com/mapstruct
 */
@SpringBootTest
class MapstructdemoApplicationTests {

  @Test
  void contextLoads() {
  }

  @Autowired
  private DtoFactory dtoFactory;


  /**
   * @Description 基本匹配
   * @Date 2021/12/24 21:19
   **/
  @Test
  public void testBaseMap() {
    UserDO userDO = new UserDO();
    userDO.setName("twc");
    userDO.setDescription("boy");
    UserDTO userDTO = dtoFactory.convertDOToDTO(userDO);
    Assert.assertEquals(userDTO.getName(), "twc");
    Assert.assertEquals(userDTO.getDescription(), "boy");
  }


  /**
   * @Description list匹配
   * @Date 2021/12/24 21:29
   **/
  @Test
  public void testListMap() {
    List<UserDO> userDOList= new ArrayList<>();
    userDOList.add(new UserDO("twc1","boy1"));
    userDOList.add(new UserDO("twc2","boy2"));

    List<UserDTO> userDTOS = dtoFactory.convertDTOList(userDOList);
    Assert.assertEquals(userDTOS.get(0).getName(), "twc1");
    Assert.assertEquals(userDTOS.get(0).getDescription(), "boy1");
    Assert.assertEquals(userDTOS.get(1).getName(), "twc2");
    Assert.assertEquals(userDTOS.get(1).getDescription(), "boy2");
  }

  /**
   * @Description 映射匹配： do与dto名字不一致
   * @Date 2021/12/24 21:36
   **/
  @Test
  public void MappingMatch() {
    UserDO userDO = new UserDO();
    userDO.setName("twc");
    userDO.setDescription("boy");
    PersonDO personDO = new PersonDO();
    personDO.setUserDO(userDO);
    personDO.setAge("18");
    PersonDTO personDTO = dtoFactory.convertToPersonDTO(personDO);


    Assert.assertEquals(personDTO.getYears(), "18");
    Assert.assertEquals(personDTO.getUserDTO().getName(), "twc");
    Assert.assertEquals(personDTO.getUserDTO().getDescription(), "boy");
  }



}
