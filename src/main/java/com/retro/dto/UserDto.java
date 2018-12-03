package com.retro.dto;

import java.util.ArrayList;
import java.util.List;


public class UserDto {
    Integer userId;
    String userName;
    String whatWentWrong;
    String whatWentWell;
    //List<SkillDto> skillDtos= new ArrayList<>();

    public UserDto(Integer userId, String userName,String whatWentWrong,String whatWentWell) {
        this.userId = userId;
        this.userName = userName;
        this.whatWentWrong=whatWentWrong;
        this.whatWentWell=whatWentWell;
       // this.skillDtos = skillDtos;
    }

    public UserDto() {
    }

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

  /*  public List<SkillDto> getSkillDtos() {
        return skillDtos;
    }

    public void setSkillDtos(List<SkillDto> skillDtos) {
        this.skillDtos = skillDtos;
    }*/
}
