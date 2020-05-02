package cn.watermelon.watermelonbackend.service.impl;

import cn.watermelon.watermelonbackend.entity.Contest;
import cn.watermelon.watermelonbackend.entity.Problem;
import cn.watermelon.watermelonbackend.mapper.ContestMapper;
import cn.watermelon.watermelonbackend.mapper.ContestWithProblemMapper;
import cn.watermelon.watermelonbackend.service.ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContestServiceImpl implements ContestService
{
    @Autowired
    ContestMapper contestMapper;
    @Autowired
    ContestWithProblemMapper contestWithProblemMapper;
    @Override
    public List<Contest> getAllContest()
    {
       return contestMapper.findAllContest();
    }
    public Contest findContestById(int id)
    {
        return contestMapper.findContestById(id);
    }
    public List<Problem> findContestProblem(int contestId)
    {
        return contestWithProblemMapper.findProblemByContest(contestId);
    }
}
