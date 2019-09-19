package com.miaoshapro.controller.viewobject;

import lombok.Data;

/**
 * @author wangsheng
 * @date 2019/9/19 0019 下午 5:48
 */
@Data
public class UserVO {

    private Integer id;
    private String uname;
    private Byte gender;
    private Integer age;
    private String phone;
}
