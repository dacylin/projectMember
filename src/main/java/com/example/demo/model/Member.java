package com.example.demo.model;

import lombok.Data;

@Data
public class Member {
    private Integer id;
    private String name;
    private String username;
    private String password;
    private String address;
    private String phone;


    public Member(String name, String username, String password, String address, String phone) {
        super();
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }


    public Member() {
        super();
        // TODO Auto-generated constructor stub
    }


}
