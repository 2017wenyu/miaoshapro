package com.miaoshapro.controller;

import com.miaoshapro.controller.viewobject.UserVO;
import com.miaoshapro.service.UserService;
import com.miaoshapro.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangsheng
 * @date 2019/9/19 0019 下午 5:49
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //关联查询，获取用户信息表和密码表全部信息
    @GetMapping("/getall")
    public UserModel getUser(@RequestParam("id")Integer user_id){
        UserModel userModel = userService.getUserById(user_id);

        return userModel;
    }

    //通过转换成只含有部分属性的 userModel
    @GetMapping("/get")
    public UserVO getUserVo(@RequestParam("id")Integer id){
        UserModel userModel = userService.getUserById(id);

        return convertFormModel(userModel);
    }

    //userModel 拥有数据库中的所有字段，但是前端显示不能显示所有字段
    //所以在 controller/viewobject 中新建了一个 UserVO 模型，只存放部分字段对应的属性
    private UserVO convertFormModel(UserModel userModel){
        if(userModel == null){
            return null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userModel,userVO);
        return userVO;
    }

}
