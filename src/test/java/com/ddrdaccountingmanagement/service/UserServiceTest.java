package com.ddrdaccountingmanagement.service;

import com.ddrdaccountingmanagement.domain.UserDTO;
import org.apache.catalina.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    UserService userService = new UserService();

    @Test
    void 회원가입() {
        //given
        UserDTO userDTO = new UserDTO();
        userDTO.setUserNm("홍길동");

        //when
        Long saveId = userService.join(userDTO);

        //then
        UserDTO findUser = userService.findUser(saveId).get();
        assertThat(userDTO.getUserNm()).isEqualTo(findUser.getUserNm()) ;
    }

    @Test
    public void 중복_회원_예외(){
        //given
        UserDTO userDTO1 = new UserDTO();
        userDTO1.setUserNm("홍길동");

        UserDTO userDTO2 = new UserDTO();
        userDTO2.setUserNm("홍길동");
        //when
        userService.join(userDTO1);
        assertThrows(IllegalStateException.class, ()-> userService.join(userDTO2));
//        try {
//            userService.join(userDTO2);
//            fail();
//        } catch (IllegalStateException e){
//            assertThat(e.getMessage()).isEqualTo("이미 존재하는 계정입니다.");
//        }
        //then
    }

    @Test
    void findUsers() {
    }

    @Test
    void findUser() {
    }
}