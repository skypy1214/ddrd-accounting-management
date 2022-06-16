package com.ddrdaccountingmanagement.controller;

import com.ddrdaccountingmanagement.domain.UserDTO;
import com.ddrdaccountingmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
public class CommonController {
    @Autowired
    private UserService userSvc;
    @RequestMapping("/")
    public List<UserDTO> selectUserList(){
        List<UserDTO> userList = new ArrayList<UserDTO>();
        userList = userSvc.selectUserList();
        return userList;
    }
}
