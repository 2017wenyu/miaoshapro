package com.miaoshapro.dao;

import com.miaoshapro.dataobject.UserPwdDO;

public interface UserPwdDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_pwd
     *
     * @mbg.generated Thu Sep 19 17:12:38 CST 2019
     */
    int insert(UserPwdDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_pwd
     *
     * @mbg.generated Thu Sep 19 17:12:38 CST 2019
     */
    int insertSelective(UserPwdDO record);

    UserPwdDO selectByUserId(Integer user_id);

}