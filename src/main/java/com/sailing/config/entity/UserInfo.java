package com.sailing.config.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @auther fox
 * @date 2018/1/22 15:28
 */

@Entity
@Data
public class UserInfo {

    @Id
    @GeneratedValue
    private Integer id;

    @NotEmpty
    private String userCode;
    @NotEmpty
    private String passWord;

}
