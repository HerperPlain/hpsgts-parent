package com.hpsgts.crm.menu.service;

import com.hpsgts.crm.menu.dao.MenuDao;
import com.hpsgts.crm.menu.entity.MenuEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuDao dao;
    @Override
    public List<MenuEntity> queryAll() {
        return dao.queryAll();
    }
}
