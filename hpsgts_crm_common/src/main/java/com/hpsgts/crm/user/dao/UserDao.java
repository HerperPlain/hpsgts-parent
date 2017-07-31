package com.hpsgts.crm.user.dao;

import com.hpsgts.crm.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<UserEntity> getALl();
}
