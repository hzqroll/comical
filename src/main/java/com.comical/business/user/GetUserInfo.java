package com.comical.business.user;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Service;

/**
 * @author zongqiang.hao
 */

@Service
public class GetUserInfo {

    @Resource(name = "comicalEventSqlMapClientTemplate")
    private SqlMapClientTemplate comicalEventSqlMapClientTemplate;

    @Test
    public void getUser(){
        List<User> userList = new ArrayList<>();
        userList =  comicalEventSqlMapClientTemplate.queryForList("ChushouUserProfileDao.getUser");
    }

}
