package com.ddrdaccountingmanagement.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private long userNo;
    private String userNm;
    private String userId;
    private String password;
    private String userInfo;
    private String userRank;
    private long regNo;
    private String regDt;
    private long updNo;
    private String updDt;
}
