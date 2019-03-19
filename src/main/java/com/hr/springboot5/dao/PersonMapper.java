package com.hr.springboot5.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hr.springboot5.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PersonMapper extends BaseMapper<Person> {
}