package com.zcl.manager.service;

import com.zcl.manager.pojo.TbItem;
import com.zcl.utils.DatagridPagebean;

/**
 * @Author :zhangchenglong
 * @Date :2018年 05月17日16时21分
 * @Theme :
 * @Description :
 */
public interface ItemService {
    TbItem findItemByID(Long itemId);

    DatagridPagebean findItemListByPage(Integer page, Integer rows);
}
