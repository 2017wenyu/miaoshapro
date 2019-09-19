package com.miaoshapro.service.impl;

import com.miaoshapro.dao.UserDOMapper;
import com.miaoshapro.dao.UserPwdDOMapper;
import com.miaoshapro.dataobject.UserDO;
import com.miaoshapro.dataobject.UserPwdDO;
import com.miaoshapro.service.UserService;
import com.miaoshapro.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wangsheng
 * @date 2019/9/19 0019 下午 5:49
 */

@Service
public class UserServicelmpl implements UserService {

    @Autowired
    UserPwdDOMapper userPwdDOMapper;

    @Autowired
    UserDOMapper userDOMapper;


    @Override
    public UserModel getUserById(Integer id) {

        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        if(userDO == null){
            return null;
        }
        UserPwdDO userPwdDO = userPwdDOMapper.selectByUserId(userDO.getId());
        return convertFromDataObject(userDO,userPwdDO);
    }

    public UserModel convertFromDataObject(UserDO userDO,UserPwdDO userPwdDO){
        if(userDO == null){
            return null;
        }
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDO,userModel);

        if(userPwdDO != null){
            userModel.setEncrptPassword(userPwdDO.getUpwd());
        }
        return userModel;
    }
}
