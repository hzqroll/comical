package com.comical.business.user;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author zongqiang.hao
 */

@Repository
public class GetUserInfo {

    @Resource(name = "comicalEventSqlMapClientTemplate")
    private SqlMapClientTemplate sqlMapClientTemplate;

    @Test
    public void getUser(){
        List<User> userList;
        userList =  sqlMapClientTemplate.queryForList("UserDao.getUser");
    }

}
