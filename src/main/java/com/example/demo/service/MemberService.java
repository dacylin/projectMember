package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Member;

public interface MemberService {
    void addMember(Member m);

    Member LoginMember(String username,String password);
    boolean selectUsername(String username);
    List<Member> selectAllMember();

    void updateMember(int id,String name,String address);

    void deleteMember(int id);


}

