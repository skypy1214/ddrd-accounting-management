package com.ddrdaccountingmanagement.service;


import com.ddrdaccountingmanagement.domain.UserDTO;
import com.ddrdaccountingmanagement.repository.UserMapper;
import com.ddrdaccountingmanagement.repository.UserRepository;
import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public class UserService {

    private final UserRepository userRepository = new UserMapper();

    /**
     * 회원가입
     * @param userDTO
     * @return
     */
    public Long join(UserDTO userDTO){
        //계정 중복 체크
        validateUserId(userDTO);
        userRepository.save(userDTO);
        return userDTO.getUserNo();
    }

    /**
     * 중복 회원 검증
     * @param userDTO
     */
    private void validateUserId(UserDTO userDTO) {
        userRepository.findByName(userDTO.getUserId())
            .ifPresent(u ->{
                throw new IllegalStateException("이미 존재하는 계정입니다.");
            });
    }

    /**
     * 전체 회원 조회
     * @return
     */
    public List<UserDTO> findUsers(){
        return userRepository.findAll();
    }


    /**
     * 회원 조회
     * @return
     */
    public Optional<UserDTO> findUser(Long userNo){
        return userRepository.findById(userNo);
    }
}
