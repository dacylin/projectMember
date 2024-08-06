package com.example.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.dao.MemberDao;
import com.example.demo.model.Member;

@Component
// 標記類為 Spring 管理的 Bean
public class MemberDaoImpl implements MemberDao{
    @Autowired
    JdbcTemplate jdbctemplate;
    // 注入 Spring 的 JdbcTemplate

    @Override
    public void add(Member m) {
        String sql="insert into member(name,username,password,address,phone)"
                + " values(?,?,?,?,?)";
        jdbctemplate.update(sql, m.getName(),m.getUsername(),m.getPassword(),m.getAddress(),m.getPhone());

    }

    @Override
    public List<Member> selectAll() {
        String sql="select * from member";
        List<Member> l=jdbctemplate.query(sql,new BeanPropertyRowMapper<Member>(Member.class));
        return l;

    }

    @Override
    public List<Member> selectMember(String username, String password) {
        String sql="select * from member where username=? and password=?";
        List<Member> l=jdbctemplate.query(sql, new BeanPropertyRowMapper<Member>(Member.class),username,password);
        return l;

    }

    @Override
    public List<Member> selectUsername(String username) {
        String sql="select * from member where username=?";
        List<Member> l=jdbctemplate.query(sql, new BeanPropertyRowMapper<Member>(Member.class),username);
        return l;

    }

    @Override
    public List<Member> selectById(int id) {
        String sql="select * from member where id=?";
        List<Member> l=jdbctemplate.query(sql, new BeanPropertyRowMapper<Member>(Member.class),id);
        return l;

    }

    @Override
    public void update(Member m) {
        String sql="update member set name=?,address=? where id=?";
        jdbctemplate.update(sql, m.getName(),m.getAddress(),m.getId());

    }


    @Override
    public void delete(int id) {
        String sql="delete from member where id=?";
        jdbctemplate.update(sql, id);

    }

}

