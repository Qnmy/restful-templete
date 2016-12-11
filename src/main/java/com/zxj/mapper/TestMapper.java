package com.zxj.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zxj.domain.Test;


@Mapper
public interface TestMapper {

	//@Select(value = { "select * from student where age = #{age}" })
	//String findByAge(@Param("age") String age);
	
	Test findByAge(String age);
}
