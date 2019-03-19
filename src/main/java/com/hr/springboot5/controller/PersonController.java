package com.hr.springboot5.controller;

import com.hr.springboot5.entity.Person;
import com.hr.springboot5.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        ModelAndView mv =new ModelAndView("/person/list");
        mv.addObject("pList",personService.findAll());
        return mv;
    }

    @RequestMapping("/find/{id}")
    public ModelAndView find(@PathVariable("id") Integer id){
        ModelAndView mv =new ModelAndView("/person/edit");
        mv.addObject("p",personService.find(id));
        return mv;
    }

    @RequestMapping("/save")
    @ResponseBody
    public int save(Person p){
        int count = personService.save(p);
        return count;
    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(Person p){
        int count = personService.update(p);
        return count;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(Integer id){
        int count = personService.delete(id);
        return count;
    }

    @RequestMapping("/toadd")
    public ModelAndView toadd(){
        ModelAndView mv=new ModelAndView("/person/add");
        return mv;
    }
}
