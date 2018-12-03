package com.retro.converter;

import com.retro.dto.UserDto;
import com.retro.entity.User;


public class UserConverter {
	public static User dtoToEntity(UserDto userDto) {
		User user = new User(userDto.getUserName(),userDto.getWhatWentWrong(),userDto.getWhatWentWell());
		user.setUserId(userDto.getUserId());
		user.setWhatWentWrong(userDto.getWhatWentWrong());
		user.setWhatWentWell(userDto.getWhatWentWell());
		//user.setSkills(userDto.getSkillDtos().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
		return user;
	}

	public static UserDto entityToDto(User user) {
		UserDto userDto = new UserDto(user.getUserId(), user.getUserName(),user.getWhatWentWrong(),user.getWhatWentWell());
		//userDto.setSkillDtos(user.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
		return userDto;
	}
}
