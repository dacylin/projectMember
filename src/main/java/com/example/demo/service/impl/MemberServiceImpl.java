package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.impl.MemberDaoImpl;
import com.example.demo.model.Member;
import com.example.demo.service.MemberService;

@Service
//標記為服務層 被Spring框架自動檢測和管理
public class MemberServiceImpl implements MemberService{
    @Autowired
    MemberDaoImpl mdi;
    // 自動注入MemberDaoImpl


    @Override
    public void addMember(Member m) {
        mdi.add(m);

    }

    @Override
    public Member LoginMember(String username, String password) {
        List<Member> l=mdi.selectMember(username, password);
        Member[] m=l.toArray(new Member[1]);
        Member M=null;
        if(l.size()!=0)
        {
            M=m[0];
        }
        return M;
    }

    @Override
    public boolean selectUsername(String username) {
        boolean x=false;
        List<Member> l=mdi.selectUsername(username);
        if(l.size()!=0)
        {
            x=true;
        }
        return x;
    }

    @Override
    public List<Member> selectAllMember() {
        // TODO Auto-generated method stub
        return mdi.selectAll();
    }

    @Override
    public void updateMember(int id, String name, String address) {
        List<Member> l=mdi.selectById(id);
        Member[]m=l.toArray(new Member[1]);
        m[0].setName(name);
        m[0].setAddress(address);

        mdi.update(m[0]);

    }

    @Override
    public void deleteMember(int id) {
        mdi.delete(id);

    }

}

