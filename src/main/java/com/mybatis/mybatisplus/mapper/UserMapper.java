package com.mybatis.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mybatis.mybatisplus.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wan
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    User selectAllByName(@Param("userName") String userName);
}