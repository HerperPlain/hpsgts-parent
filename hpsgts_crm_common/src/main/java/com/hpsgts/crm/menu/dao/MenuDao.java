package com.hpsgts.crm.menu.dao;

import com.hpsgts.crm.menu.entity.MenuEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MenuDao {

    public List<MenuEntity> queryAll();

    public List<MenuEntity> loadUserResources(Map<String, Object> map);

    public List<MenuEntity> queryResourcesListWithSelected(String rid);
}