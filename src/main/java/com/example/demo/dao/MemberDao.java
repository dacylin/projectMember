package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Member;

public interface MemberDao {
    void add(Member m);

    List<Member> selectAll();
    List<Member> selectMember(String username,String password);
    List<Member> selectUsername(String username);
    List<Member> selectById(int id);

    void update(Member m);

    void delete(int id);

}
