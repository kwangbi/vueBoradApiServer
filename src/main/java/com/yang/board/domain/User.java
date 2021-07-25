package com.yang.board.domain;

import com.yang.board.dto.UserForm;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    @Column(length = 50,nullable = false)
    private String userName;

    @Column(length = 50, nullable = true)
    private String email;

    @Column(nullable = false)
    private String password;

    public User(){}

    public User(UserForm userForm) {
        this.email = userForm.getEmail();
        this.userName = userForm.getUserName();
        this.password = userForm.getPassword();
    }

    public static User createUser(UserForm userForm){
        return new User(userForm);
    }


}
