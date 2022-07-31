package com.ddrdaccountingmanagement.repository;

import com.ddrdaccountingmanagement.domain.UserDTO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class UserMapperTest {
    @AfterEach
    public void afterEach(){
        repo.clearStore();
    }
    UserMapper repo = new UserMapper();

    @Test
    public void save(){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserNm("회원1");
        repo.save(userDTO);

        UserDTO result = repo.findById(userDTO.getUserNo()).get();
        assertThat(userDTO).isEqualTo(result);
    }

    @Test
    public void findByName(){
        UserDTO userDTO1 = new UserDTO();
        userDTO1.setUserNm("회원1");
        repo.save(userDTO1);

        UserDTO userDTO2 = new UserDTO();
        userDTO2.setUserNm("회원2");
        repo.save(userDTO2);

        UserDTO result = repo.findByName("회원2").get();

        assertThat(result).isEqualTo(userDTO2);
    }

    @Test
    public void findAll(){
        UserDTO userDTO1 = new UserDTO();
        userDTO1.setUserNm("회원1");
        repo.save(userDTO1);

        UserDTO userDTO2 = new UserDTO();
        userDTO2.setUserNm("회원2");
        repo.save(userDTO2);

        List<UserDTO> result = repo.findAll();

        assertThat(result.size()).isEqualTo(2);
    }
}
