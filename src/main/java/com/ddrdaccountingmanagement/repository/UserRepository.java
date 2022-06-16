package com.ddrdaccountingmanagement.repository;

import com.ddrdaccountingmanagement.domain.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserRepository {
    List<UserDTO> selectUserList();
}
