package com.ddrdaccountingmanagement.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    long userNo;
    String userNm;
    String userId;
    String password;
    String userInfo;
    String userRank;
    long regNo;
    String regDt;
    long updNo;
    String updDt;
}
