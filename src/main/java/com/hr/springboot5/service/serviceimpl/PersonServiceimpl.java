package com.hr.springboot5.service.serviceimpl;

import com.hr.springboot5.dao.PersonMapper;
import com.hr.springboot5.entity.Person;
import com.hr.springboot5.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceimpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    public List<Person> findAll(){
        Map<String,Object> map=new HashMap<>();
        return personMapper.selectByMap(map);
    }

    @Override
    public Person find(Integer id) {
        return personMapper.selectById(id);
    }

    @Override
    public int save(Person p) {
        return personMapper.insert(p);
    }

    @Override
    public int update(Person p) {
        return personMapper.updateById(p);
    }

    @Override
    public int delete(Integer id) {
        return personMapper.deleteById(id);
    }
}
