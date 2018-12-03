package com.retro.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;


@Entity
public class User implements Serializable{

    private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;
	
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer userId;
    @Column
    private String userName;
    @Column
    private String whatWentWrong;
    
    @Column
    private String whatWentWell;
   /* @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Skill> skills= new LinkedList<>();*/

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    public String getWhatWentWrong() {
        return whatWentWrong;
    }

    public void setWhatWentWrong(String whatWentWrong) {
        this.whatWentWrong = whatWentWrong;
    }
    
    public String getWhatWentWell() {
        return whatWentWell;
    }

    public void setWhatWentWell(String whatWentWell) {
        this.whatWentWell = whatWentWell;
    }
    /*public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }*/

    public User() {
    }

    public User(String userName, String whatWentWrong,String whatWentWell) {
        this.userName = userName;
        this.whatWentWrong = whatWentWrong;
        this.whatWentWell=whatWentWell;
    }
}
