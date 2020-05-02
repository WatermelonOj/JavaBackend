package cn.watermelon.watermelonbackend.service;

import cn.watermelon.watermelonbackend.entity.Contest;
import cn.watermelon.watermelonbackend.entity.Problem;

import java.util.List;

public interface ContestService
{
    List<Contest> getAllContest();
    List<Problem> findContestProblem(int contestId);
}
