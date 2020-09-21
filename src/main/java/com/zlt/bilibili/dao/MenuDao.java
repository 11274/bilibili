package com.zlt.bilibili.dao;

import com.zlt.bilibili.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao {
    public List<MainMenu> getMainMenus();
}
