package com.twc.mapstrutdemo.Factory;

import com.twc.mapstrutdemo.pojo.PersonDO;
import com.twc.mapstrutdemo.pojo.PersonDTO;
import com.twc.mapstrutdemo.pojo.UserDO;
import com.twc.mapstrutdemo.pojo.UserDTO;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;

/**
 * @Author: twc
 * @Date 2021/12/24 20:57
 **/
@Mapper(componentModel = "spring")
@Component
public interface DtoFactory {

    UserDTO convertDOToDTO(UserDO userDO);

    List<UserDTO> convertDTOList(List<UserDO> userDOList);

    @Mappings({
        @Mapping(target = "years",source = "age"),
        @Mapping(target = "userDTO",source = "userDO")
    })
    PersonDTO convertToPersonDTO(PersonDO personDO);

}
