package cn.watermelon.watermelonbackend.controller;

import cn.watermelon.watermelonbackend.entity.Problem;
import cn.watermelon.watermelonbackend.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping(value = "/problem/all", method= RequestMethod.GET)
    public List<Problem> getAll()
    {
        synchronized (this)
        {
            if(redisTemplate.opsForValue().get("problem") == null)
            {
                redisTemplate.opsForValue().set("problem",problemService.findAll());
            }
        }
        return (List<Problem>) redisTemplate.opsForValue().get("problem");

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
    @RequestMapping(value = "/testredis",method = RequestMethod.GET)
            public String Test()
    {
        redisTemplate.opsForValue().set("1","gg");
        return (String)redisTemplate.opsForValue().get("1");
    }
}
