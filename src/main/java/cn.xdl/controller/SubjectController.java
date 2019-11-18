package cn.xdl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.xdl.pojo.Subject;
import cn.xdl.service.SubjectService;

@Controller
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @RequestMapping("/subject/list")
    public ModelAndView load() {
    	ModelAndView av = new ModelAndView();
    	av.setViewName("list");
    	List<Subject> list = subjectService.loadSubject();
    	av.getModel().put("data", list);
    	return av;
    }
}
