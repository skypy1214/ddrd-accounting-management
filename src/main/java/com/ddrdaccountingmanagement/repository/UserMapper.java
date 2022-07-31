package com.ddrdaccountingmanagement.repository;

import com.ddrdaccountingmanagement.domain.UserDTO;

import java.lang.reflect.Member;
import java.util.*;

public class UserMapper implements UserRepository{

    private static Map<Long, UserDTO> store = new HashMap<>();
    private static long seq = 0L;


    @Override
    public UserDTO save(UserDTO userDTO) {
        userDTO.setUserNo(++seq);
        store.put(userDTO.getUserNo(), userDTO);

        return userDTO;
    }

    @Override
    public Optional<UserDTO> findByName(String name) {
        return store.values().stream()
                .filter(userDTO -> userDTO.getUserNm().equals(name))
                .findAny();
    }

    @Override
    public Optional<UserDTO> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public List<UserDTO> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }
}
