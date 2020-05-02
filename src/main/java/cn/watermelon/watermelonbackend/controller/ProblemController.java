package cn.watermelon.watermelonbackend.controller;

import cn.watermelon.watermelonbackend.entity.Problem;
import cn.watermelon.watermelonbackend.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.util.List;

@RestController
public class ProblemController
{
    @Autowired
    private ProblemService problemService;
    @RequestMapping(value = "/problem/all", method= RequestMethod.GET)
    public List<Problem> getAll()
    {
        return problemService.findAll();
    }
    @RequestMapping(value = "/problem/name",method = RequestMethod.GET)
    public List<Problem> getProblemByName(String name)
    {
        return problemService.findProblemByName(name);
    }
    @RequestMapping(value = "/problem/id",method = RequestMethod.GET)
    public List<Problem> getProblemById(int id)
    {
        return problemService.findProblemById(id);
    }
}
