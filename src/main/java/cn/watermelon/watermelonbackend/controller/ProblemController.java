package cn.watermelon.watermelonbackend.controller;

import cn.watermelon.watermelonbackend.entity.Problem;
import cn.watermelon.watermelonbackend.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestBody;
>>>>>>> dbeed8fb9adc7adadc42aef706c68dffd03163d5
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
<<<<<<< HEAD
=======
    @RequestMapping(value = "/name",method = RequestMethod.GET)
    public List<Problem> getProblemByName(String name)
    {
        return problemService.findProblemByName(name);
    }
    @RequestMapping(value = "/id",method = RequestMethod.GET)
    public List<Problem> getProblemById(@RequestBody int id)
    {
        return problemService.findProblemById(id);
    }
>>>>>>> dbeed8fb9adc7adadc42aef706c68dffd03163d5
}
