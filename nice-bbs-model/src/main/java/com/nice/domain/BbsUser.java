package com.nice.domain;

//import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ningh
 */
//@Data
public class BbsUser implements Serializable {

    private Long bbsUserId;
    private String bbsUserName;
    private Integer bbsUserAge;
    private String bbsUserGender;
    private Date bbsUserCreateDate;
    private Date bbsUserUpdateDate;
    private String bbsUserRemark;
    private Boolean bbsUserIsLock;


}
