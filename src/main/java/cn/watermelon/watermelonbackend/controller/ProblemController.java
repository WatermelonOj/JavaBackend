package cn.watermelon.watermelonbackend.controller;

import cn.watermelon.watermelonbackend.entity.Problem;
import cn.watermelon.watermelonbackend.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;
import java.util.List;

@RestController
@RequestMapping("/problem")
public class ProblemController
{
    @Autowired
    private ProblemService problemService;
    @RequestMapping(value = "/all", method= RequestMethod.GET)
    public List<Problem> getAll()
    {
        return problemService.findAll();
    }
}
