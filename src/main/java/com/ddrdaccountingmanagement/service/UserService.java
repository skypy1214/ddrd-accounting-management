package com.ddrdaccountingmanagement.service;

import com.ddrdaccountingmanagement.domain.UserDTO;
import com.ddrdaccountingmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService( UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> selectUserList(){
        List<UserDTO> result;
        result = userRepository.selectUserList();
        return result;
    }
}
