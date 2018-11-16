package com.example.homepage.dao;

import com.example.homepage.entities.Person;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

/**
 * Created By xfj on 2018/11/16
 */
@Repository
public class PersonDao extends BaseDao{
    public int create(Person person) {
        SqlSession sqlSession = this.getSessionFactory().openSession();
        try {
            return sqlSession.insert("create", person);
        } finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }
}
