package com.miaoshapro.service.model;

import lombok.Data;

/**
 * @author wangsheng
 * @date 2019/9/19 0019 下午 5:50
 */
@Data
public class UserModel {

    private Integer id;
    private String uname;
    private Byte gender;
    private Integer age;
    private String phone;
    private String registerMode;
    private String thirdPartyId;

    private String encrptPassword;

}
