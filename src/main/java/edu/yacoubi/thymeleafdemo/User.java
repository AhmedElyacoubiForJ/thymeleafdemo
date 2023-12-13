package edu.yacoubi.thymeleafdemo;

import lombok.*;

import java.sql.Date;


@Data
public class User {
    private String name;
    private String email;
    private String password;
    private String gender;
    private String note;
    private String profession;
    private boolean married;

    private Date birthday;
}