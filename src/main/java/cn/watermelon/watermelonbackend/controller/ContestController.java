package cn.watermelon.watermelonbackend.controller;

import cn.watermelon.watermelonbackend.entity.Contest;
import cn.watermelon.watermelonbackend.entity.Problem;
import cn.watermelon.watermelonbackend.service.ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContestController {
    @Autowired
    ContestService contestService;
    @RequestMapping(value = "/contest/all",method = RequestMethod.GET)
    public List<Contest> getAllContest()
    {
        return contestService.getAllContest();
    }
    @RequestMapping(value = "/contest/problem",method = RequestMethod.GET)
    public List<Problem> getProblem(int contestId)
    {
        return contestService.findContestProblem(contestId);
    }
}
