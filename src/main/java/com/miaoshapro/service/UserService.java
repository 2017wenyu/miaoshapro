package com.miaoshapro.service;

import com.miaoshapro.service.model.UserModel;

/**
 * @author wangsheng
 * @date 2019/9/19 0019 下午 5:50
 */

public interface UserService {

    //通过用户id获取用户对象信息的方法
    UserModel getUserById(Integer id);
}
