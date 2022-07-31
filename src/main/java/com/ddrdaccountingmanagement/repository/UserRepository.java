package com.ddrdaccountingmanagement.repository;

import com.ddrdaccountingmanagement.domain.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Mapper
public interface UserRepository {
    UserDTO save(UserDTO userDTO);
    Optional<UserDTO> findByName(String name);
    Optional<UserDTO> findById(Long id);
    List<UserDTO> findAll();
}
