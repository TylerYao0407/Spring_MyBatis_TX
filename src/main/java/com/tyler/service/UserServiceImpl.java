package com.tyler.service;

import com.tyler.model.User;
import org.mybatis.spring.SqlSessionTemplate;

/**
 * Created by tyler on 2016/12/21.
 */
public class UserServiceImpl implements UserService {
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
    public User selectUser(Integer id) {
        User user = new User();
        user.setName("你哈aaaa啊");
        user.setAge(12);
        sqlSessionTemplate.insert("com.tyler.dao.UserMapper.insert",user);
        sqlSessionTemplate.delete("com.tyler.dao.UserMapper.deleteByPrimaryKey",1);
        return sqlSessionTemplate.selectOne("com.tyler.dao.UserMapper.selectByPrimaryKey",id);
    }
}
