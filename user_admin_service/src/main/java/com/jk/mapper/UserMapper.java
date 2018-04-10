package com.jk.mapper;

import com.jk.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select userid,username,userpass from t_user")
    List<User> queryUser();
}
